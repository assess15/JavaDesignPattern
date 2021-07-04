package com.laychv.design.structural.ProxyPattern.staticproxy;

/**
 * @link https://segmentfault.com/a/1190000009235245
 *
 * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
 * 关键：在编译期确定代理对象，在程序运行前代理类的.class文件就已经存在了。
 * 比如：在代理对象中实例化被代理对象或者将被代理对象传入代理对象的构造方法
 * 例子：
 * 模拟保存动作,定义一个保存动作的接口:IUserDao.java,
 * 然后目标对象UserDao.java实现这个接口的方法,此时如果使用静态代理方式,
 * 就需要在代理对象(UserDaoProxy.java)中也实现IUserDao接口.
 * 调用的时候通过调用代理对象的方法来调用目标对象.
 * 需要注意的是,代理对象与目标对象要实现相同的接口,
 * 然后通过调用相同的方法来调用目标对象的方法
 *
 * 总结:
 * 可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 缺点: 代理类和委托类实现相同的接口，同时要实现相同的方法。这样就出现了大量的代码重复。
 * 如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。
 */
public class Test {
    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDao());
        proxy.save();
    }
}
