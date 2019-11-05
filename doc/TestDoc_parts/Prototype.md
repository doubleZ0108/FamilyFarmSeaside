# Prototype Pattern

## 1. ⚠️为什么你的test能体现设计模式（中文）

原型模式即用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。

在该测试中，以Animal中的Chicken为例，首先创建一个Chicken对象chicken，然后调用根据原型模式设计的clone方法，直接根据chicken复制出一个Chicken对象chicken1。

为了检测chicken和chicken1是否的确是两个对象而不是二者指向同一地址，可以使用java的“==”与equals（equals继承自Object中的equals方法，需要在类中重新实现）的不同来测试。

“==”用来判断两个对象是否指向同一地址，“equals”则用来判断两个对象中内容是否相同。

如果“chicken==chicken1”返回false，而"chicken.equals(chicken1)"返回true，则说明Prototype pattern得到了实现。

## 2. 你的test的用例简单描述（中文）

1. 创建一个Chicken对象chicken
2. 调用chicken的clone方法复制一个新的Chicken对象chicken1.
3. 输出“chicken==chicken1”和"chicken.equals(chicken1)"的结果。
