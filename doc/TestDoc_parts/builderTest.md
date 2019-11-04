#  Builder

## 1. ⚠️为什么你的test能体现设计模式（中文） 

Builder 模式是为了解决在初始化一个具有多个属性的复杂对象的过程中可以出现的问题而提出的设计模式。我们可以看到，如果没有 Builder 模式，那么在我们初始化一个具有多个属性的复杂对象的过程中就会不得不使用一个巨大的构造函数或者是将构造的逻辑分布在各个不同的类中。

而在实现了 Builder 模式之后，我们的创建过程就变得更加简单了。在我们的测试中，用户既可以通过内置于 ShortTermWorker 各个子类的 buildSomeThingNormal() 函数中的 Director来实现简单的对象生成，也能通过直接调用类似于 breedSceneBuilderImpl 中的各类 set 函数来完成对象生产工作，这确实是 Builder 模式的标准体现。

## 2. 你的test的用例简单描述（中文）

1. 通过 BreedSceneBuilder、HouseBuilder 以及 WarehouseBuilder 中的 buildSomeThingNormal 函数中内置的 Director 类来实现一种普遍情况的创建。
2. 通过邀请用户设置建筑的种类和位置来直接使用 BreedSceneBuilderImpl 等类中的各个 set 函数。
