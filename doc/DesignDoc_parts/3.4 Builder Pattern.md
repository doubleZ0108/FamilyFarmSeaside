##  3.4  Builder Pattern

### 设计模式简述

​	建造者模式允许用户一步步构建复杂的对象，而避免处理多个类之间过度复杂的继承关系或者使用单个巨大的构造函数。与此同时，建造者模式允许用户使用同一组构造接口来创造多种不同的对象，从而方便用户的使用。

### 3.4.1 ShortTermWorker 实现 API

#### 3.4.1.1 API 描述

​	在我们的类中有一类短期劳工，他们主要是为了模拟现实生活中农场主在需要新建各种建筑物的时候需要招聘短期工人的情景。他们能构建各种建筑，包括用于住宿的工人宿舍和农场主的别墅；用于养殖的农场、鱼塘和窝棚；用于储存物资的仓库。我们可以发现，这些建筑的构建过程都有类似的设置步骤，包括选定位置、确定建筑种类以及设置截至日期，将这些方法抽取出来，既能分解复杂的构造过程，也能允许一个 Director 来对一些常用的构建计划进行封装。

| 函数名                            | 作用                                                         |
| --------------------------------- | ------------------------------------------------------------ |
| void setLocation(String location) | 如上说明，本函数定义于 Builder 接口中，分别在 BreedSceneBuilderImpl，HouseSceneBuilderImpl，WareHouseBuilderImpl 中进行不同的实现。 |
| void setBuildingPlan(String plan) | 同上所述。                                                   |
| void setDueDate(Date dueDate)     | 同上所述。                                                   |
| ？getResult()                     | 本函数并不定义在 Builder 接口中，因为各个建造者的实现类中将存有的不同类的对象用于构建，所以他们的 getResult 函数将具有不同的返回类型。 |
| void buildANormalScene()          | 本函数定义在 Director 类中。在构造函数获取了具体的 Builder 类之后，Director 能给根据一组事先定义的默认步骤来构造建筑，从而进一步简化使用。 |

#### 3.4.1.2 类图

![Builder](Builder.png)	为了实现 Builder 设计模式，我们设计了如上的一些类来进行展示。首先，我们需要实现一个 Builder 的 interface，这个接口定义了一组公共的操作，其中包括了重置（将内部包含的对象清空，重新开始创建）、选定位置（为目标建筑确定位置）、设置建筑计划（正如上部分的继承系统可见，一大类的建筑可能有多个不同的小类，我们需要选择到底是要修建哪一个类型的建筑）、设置到期时间（一个工程计划应该根据到期的时间来确认如何进行规划）。在有了接口之后，我们就选择了两个不同种类的建筑物群体实现了两个实现类，分别是 BreedSceneBuilderImpl、HouseBuilderImpl 和 WarehouseBuilderImpl，分别实现了建造养殖类情景和建造住宿类情景。它们都基于相同的 Builder interface，只不过对于不同的函数做出了不同的实现。例如，在 BreeadSceneBuilderImpl 中，我们设置简直类型就只能在 Farmland、FishPond 和 LivestockFarm 中进行选择；而在 HouseBuilderImpl 中，我们所设置的类型就只能在 Villa、ReceptionCenter 和 Dormitory 中进行选择了。

​	除此之外，我们还实现了 Director 类，这个类按照设计模式的说明并不是必须的，但是我们仍然提供了这个类从而确保设计模式实现的完整性。这个类的意义在于封装一些较为常见的构建过程封装起来了。例如我们提供的 buildNormalScene 方法就能够完成一系列自动的构建过程，从而为用户建造出一系列的建筑物而不需要用户来处理构建的细节。

![Builder_sqe](Builder_sqe.png)

这是我们具体的函数调用过程，我们可以看到，我们的 Test 类首先创建了一些建筑工人，因为它们持有的特定的 builder 实现类，从而进行来实现相应的功能。而后我们将创造的建筑工人传递到 Director 里面去，由 Director 来代理建筑工人的建造过程。在完成之后，再从各个实现中取出相应的成品类。