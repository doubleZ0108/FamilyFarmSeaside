##3.4.Adapter适配器模式
###设计模式简述
  在现实生活中，经常出现两个对象因接口不兼容而不能在一起工作的实例，这时需要第三者进行适配。在软件设计中也可能出现：需要开发的具有某种业务功能的组件在现有的组件库中已经存在，但它们与当前系统的接口规范不兼容，如果重新开发这些组件成本又很高，这时用适配器模式能很好地解决这些问题。
###3.4.1 Watchdog实现API
####3.4.1.1 API描述
看门狗是一种狗，它有狗应该具有的生理需求，如吃（eat），睡（sleep）。但之前开发的Dog类继承自Product类，看门狗实际上不应该属于Product, 它又与Dog是有区别的，但重新开发eat和sleep功能又会产生新的成本（假设eat 和 sleep 开发成本很高），且如果Dog后续进行维护，Watchdog无法与其保持一致。
选择使用适配器模式，定义一个适配器类来实现当前看门狗的业务接口，同时又继承现有Dog类已有功能，这样减少了开发成本，还降低了Watchdog和Dog之间的耦合性。

| 函数名                                                       | 作用                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| eat():void                                          | Adapter类里的eat函数是对Watchdog里函数的实现，在函数中，调用适配者（即dog对象）的eat函数。 |
| getName():String                                     | 获取Adapter适配的Watchdog的名字 |
| setName(String name):void | 设置Adapter适配的Watchdog的名字 |



####3.4.1.2类图
![Adapter](Diagram/Adapter/Adapter_class_diagram.jpg)
####3.12.1.3流程图
####3.12.1.4时序图