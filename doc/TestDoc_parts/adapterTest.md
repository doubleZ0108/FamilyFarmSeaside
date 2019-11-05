#  Adapter 



## 1. ⚠️为什么你的test能体现设计模式（中文）

适配器模式是将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

在该测试中，使用适配器Adapter的对象来实现接口看门狗Watchdog，用户可以直接通过接口Watchdog来执行dog类有的eat, sleep操作。



## 2. 你的test的用例简单描述（中文）

1. 用户创建一个Dog类的对象

2. 用户用该Dog类对象创建并初始化Watchdog的实现类Adapter的对象watchdog

3.用户通过watchdog来执行eat, sleep等从Dog类中抽取的操作

4.用户通过watchdog来执行bark等在Adapter内部实现的操作bark


## 3. 最好在Test里添加交互的部分，可以参考AbstractFactoryTest，如果实在没法交互一定要详细写清楚第一点

## 4. 所有类添加注释

## 5. 稍微长一点的类的方法添加注释