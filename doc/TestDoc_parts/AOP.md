#  AOP

## 1. ⚠️为什么你的test能体现设计模式（中文） 

AOP 是为了将一个系统中的各个模块的共有部分抽取出来，将这些功能实现为对象，从而实现集中的管理与复用。在我们的例子中，我们就成功的演示了在不修改原有的类（原有的类对此改动是无知的）的情况下，拓展一些方法的可能性。

我们将 qualityAssuranceTeam 以及 supplyTeam 这两个普适性的类和 BreedSceneBuilder 以及 WarehouseBuilder 这样针对某个特定功能的类进行了交叉，展现出较好的可拓展性。

## 2. 你的test的用例简单描述（中文）

1. 通过创建层层嵌套的类（QA_Breed、Supply_Warehouse 以及 QA_Supply_Warehouse）来向用户展示一种在不修改原有类的基础上进行拓展的可能性。