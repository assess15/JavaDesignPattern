## UML

### UML基础

### UML类图

### UML时序图

实线+三角形箭头：同步调用

实线+右箭头：异步调用

虚线+左箭头：返回

### UML用例图 

### UML类关系

### UML类图

```
类名
Class 
---
类的属性
+name:String     + public
-age:int         - private
#weight:double   # protected
~height:double   ~ default
<u>+sex:char</u> 横线表示static属性
---
类的行为
+eat(food)
#drink()
-walk()
~run()
+study()    斜体代表抽象方法
+openMac():boolean  ：表示返回值
+playGames()
```



### UML记忆技巧

空心三角箭头：继承或者实现

线的虚实：实线-extends，虚线-implements

线的虚实：实线-关联，虚线-依赖

空心菱形：聚合：整体与局部的关系，二者有独立的生命周期，has a 关系，弱关系，弱-空

实心菱形：组合：整体与局部的关系，与聚合的关系相比，关系更强烈，二者有相同的生命周期，contains-a的关系，强关系，强-满