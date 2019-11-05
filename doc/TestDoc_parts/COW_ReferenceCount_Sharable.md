#  Copy On Write、Reference Counting、Sharable



## 1. ⚠️为什么你的test能体现设计模式（中文）

​    写入时复制是说如果有多个调用者同时请求相同资源，他们会共同获取相同的指针指向相同的资源，直到某个调用者试图修改资源的内容时，系统才会真正复制一份专用副本给该调用者。

​     引用计数是说将对象的引用次数记录下来，当引用次数变为0时就自动释放。

​	  共享体现在写时复制的过程中。

在我们的场景中，相同的资源是说一间宿舍的床、桌子和椅子。在创建一栋宿舍楼的过程中需要创建大量宿舍（我们这里简化为10间宿舍），当新建时所有宿舍的家具完全是可以共享的，直到它们被修改（我们这里简化为移动家具）时我们才需要为该宿舍新创建一个备份然后再修改。这样可以加快一间宿舍的新建速度，而不需要一开始就新建大量对象。

每次新建一个家具对象的备份时，该家具对象的引用计数应该减去一，减到0时我们就释放该对象（虽然Jvm自己会处理）。

然后为某间宿舍新建一个家具对象的备份后，下一次再修改该家具对象就没必要再创建一个新的备份了，所以我们把它的Sharable属性修改为false，这样宿舍修改家具对象前就不会创建备份。

## 2. 你的test的用例简单描述（中文）

1. 新建一间宿舍，这时会打印出新建每件宿舍的信息，包括该宿舍的家具是新建的还是共享的。
2. 选择第一间宿舍，移动这间宿舍的床，这时应该会产生一个备份。
3. 再次移动这张床，这时就不会再产生备份了。
4. 把所有宿舍的床都移动一下，这时原始的床对象应该被释放了。

## 3. 最好在Test里添加交互的部分，可以参考AbstractFactoryTest，如果实在没法交互一定要详细写清楚第一点

## 4. 所有类添加注释

## 5. 稍微长一点的类的方法添加注释