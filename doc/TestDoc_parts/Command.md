# CommandTest

## 1. ⚠️为什么你的test能体现设计模式（中文） 

**Command** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations. 

Command 设计模式是为了解决各种界面所接受的用户操作的过程中所产生的大量重复问题而实现的一种将一种请求转化为单独的对象的设计模式。这种转化能够让我们复用命令、延迟调用并且实现撤销操作。在我们的例子中，我们的农场主将命令发给了 ResidenceAdministrator 以及 ResourceAdministrator，从而使得它们能在合适的时候执行被给予的命令（首先是定时的任务，而后是邀请用户来要求它们执行指令），从而完整的体现了 command 设计模式的优越性。

## 2. 你的test的用例简单描述（中文）

1. 通过 lambda 表达式创建一些 command 的包装类（并无设计模式上的特殊意义，只是 Java 语法的限制）
2. 通过 sleep 函数来在一些时限之后（每1s）执行一些记录日志的命令，然后打印出来当时的日志。而后执行两次 undo 指令，从而测试撤销功能。
3. 邀请用户来输入指令，我们进行执行。