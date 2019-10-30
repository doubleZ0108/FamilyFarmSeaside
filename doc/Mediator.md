## 3.14 Mediator Pattern

### 设计模式简述

中介者（Mediator）模式：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。

- 降低了对象之间的耦合性，使得对象易于独立地被复用。
- 将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。

其主要缺点是：当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。

### 3.14.1 Flower的人工传粉实现API

#### 3.14.1.1 API描述

植物分为异花授粉与自花受粉两种，自花授粉无需人工帮助，异花授粉需人工帮助，在目前拥有的植物中：苹果、樱桃为异花授粉植物，土豆、马铃薯为自花授粉植物。植物开花时会随机创建一定数量的flower对象，flower分为femaleflower与maleflower两种。多个femaleflower与maleflower进行交互，如果两者直接进行交互会产生较为复杂的耦合关系，所以加入人为中介者进行帮助传粉。

设计如下：当femaleflower可以进行授粉时，personMediator会接受到需要授粉的信息，并将此信息广播给maleflower，若maleflower已没有花粉，则返回没有花粉，若maleflower拥有花粉，则返回可以授粉的信息，从maleflower中选取第一个拥有花粉的flower对femaleflower进行授粉。

| 函数名           | 作用                                                         |
| ---------------- | ------------------------------------------------------------ |
| sendMessgae()    | 对于maleflower，送出花粉；对于femaleflower，送出需要花粉的信息 |
| receiveMessage() | 对于maleflower，接收需要花粉的请求；对于femaleflower，接收花粉 |
| register()       | flower对象在被创建后，需要在mediator中注册，使mediator得知有一个对象加入了系统之中 |
| reply()          | flower在发送消息时，需要mediator帮忙转发，同时mediator接收其他对象的回复 |