##3.5.Bridge桥接模式
###设计模式简述
  在现实生活中，某些类具有两个或多个维度的变化，如果用继承方式，不但对应的子类很多，而且扩展困难。选择桥接（Bridge）模式，将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
###3.5.1 Bridge实现API
####3.5.1.1 API描述
  豌豆（Pea）有不同颜色，也有不同形状。当豌豆的颜色和形状互相组合的时候，将每个组合都开发成一个新的子类显然开发量很大，而且很难进行后续的开发。创建一个颜色（Color）类，用不同的子类与Pea的子类的组合关系来代替单纯开发Pea的子类，可以降低两种性状的偶尔性，后续也可以开发其他颜色和其他形状。

|函数名              |	作用                       |
|-------------------|-------------|
|getColor():String	|继承自Color类，返回具体颜色的字符串|
|Pea(Color color)|	用颜色对象作为参数来构造一个豌豆对象，实现颜色与豌豆本身的解耦|
|getName():String	|继承自Pea类，返回Pea的颜色和形状|


####3.5.1.2类图
![Bridge](Diagram/Bridge/Bridge_class_diagram.jpg)

####3.5.1.3流程图
####3.5.1.4时序图
