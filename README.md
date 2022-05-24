# 设计模式

学习设计模式可以提升代码质量及整体架构，在实践过程中切莫过度设计，设计模式核心就是**匹配业务模型**，决定使用哪种最优设计模式。

## 设计原则

| [SOLID原则](/theory/设计原则.md)        | 概述                                                        |
|:----------------------------------|-----------------------------------------------------------|
| <font size=2>S 单一职责原则(SRP)</font> | 一个类/接口/方法只负责一项职责                                          |
| <font size=2>O 开闭原则(OCP)</font>   | 对拓展开放，对修改关闭                                               |
| <font size=2>L 里氏替换原则(LSP)</font> | 只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或异常，使用者可能根本不需要知道是父类还是子类 |
| <font size=2>L 迪米特原则(LOD)</font>  | 一个对象应该对其他对象保持最少的了解，又叫最少知道原则                               |
| <font size=2>I 接口隔离原则(ISP)</font> | 一个类对一个类的依赖应该建立在最小的接口上                                     |
| <font size=2>D 依赖倒置原则(DIP)</font> | 抽象不应该依赖细节，细节应该依赖抽象                                        |

## 设计模式类型

| 创建型模式                                                                        | 概述                                   |
|:-----------------------------------------------------------------------------|--------------------------------------|
| [<font size=2>单例模式（Singleton Pattern）</font>](./theory/创建型/单例模式.md)          | 一个类一个实例                              |
| [<font size=2>工厂模式（Factory Pattern）</font>](./theory/创建型/工厂方法.md)            | 创建对象的接口，让子类决定实例化哪个类                  |
| [<font size=2>原型模式（Prototype Pattern）</font>](./theory/创建型/原型模式.md)          | 通过拷贝这些原型创建新的对象                       |
| [<font size=2>建造者模式（Builder Pattern）</font>](./theory/创建型/建造者模式.md)          | 一个类一个实例                              |
| [<font size=2>抽象工厂模式（Abstract Factory Pattern）</font>](./theory/创建型/抽象工厂.md) | 为创建一组相关或者是互相依赖的对象提供一个接口，而不需要指定它们的具体类 |

| 结构型模式                                                                | 概述                                                  |
|:---------------------------------------------------------------------|-----------------------------------------------------|
| [<font size=2>代理模式（Proxy Pattern）</font>](./theory/结构型/代理模式.md)      | 为其他对象提供一种代理来控制对这个对象的访问                              |
| [<font size=2>适配器模式（Adapter Pattern）</font>](./theory/结构型/适配器模式.md)  | 把一个类的接口转换成客户所期待的另一种接口，使无法因为接口不匹配而无法在一起工作的两个类能够在一起工作 |
| [<font size=2>装饰器模式（Decorator Pattern）</font>](theory/结构型/装饰模式.md)   | 动态地给一个对象添加额外的职责                                     |
| [<font size=2>享元模式（Flyweight Pattern）</font>](./theory/结构型/享元模式.md)  | 使用共享对象可有效的支持大量颗粒度的对象                                |
| [<font size=2>外观模式（Facade Pattern）</font>](./theory/结构型/外观模式.md)     | 要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行                      |
| [<font size=2>桥接模式（Bridge Pattern）</font>](./theory/结构型/桥接模式.md)     | 通过桥梁连接抽象部分与实现部分                                     |
| [<font size=2>组合模式（Composite Pattern））</font>](./theory/结构型/组合模式.md) | 部分与整体                                               |

| 行为型模式                                                                               | 概述                                                                    |
|:------------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| [<font size=2>责任链模式（Chain of Responsibility Pattern）</font>](./theory/行为型/责任链模式.md) | 使多个对象都有机会处理请求，从而避免了请求的发送者和接收者间的耦合关系;将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止 |
| [<font size=2>策略模式（Strategy Pattern）</font>](./theory/行为型/策略模式.md)                  | 定义了一些列算法，将每个算法封装起来，使它们可以相互替换,让算法独立于使用它的客户而独立变化                        |
| [<font size=2>模板模式（Template Pattern）</font>](./theory/行为型/模板方法.md)                  | 封装流程                                                                  |
| [<font size=2>观察者模式（Observer Pattern）</font>](./theory/行为型/观察者模式.md)                | 定义对象间一种一对多关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新。                     |
| <font size=2>备忘录模式（Memento Pattern）</font>                                          ||
| <font size=2>迭代器模式（Iterator Pattern）</font>                                         ||
| <font size=2>中介者模式（Mediator Pattern）</font>                                         ||
| <font size=2>命令模式（Command Pattern）</font>                                           ||
| <font size=2>访问者模式（Visitor Pattern）</font>                                          ||
| <font size=2>解释器模式（Interpreter Pattern）</font>                                      ||
| <font size=2>状态模式（State Pattern）</font>                                             ||