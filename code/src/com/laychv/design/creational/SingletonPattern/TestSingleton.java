package com.laychv.design.creational.SingletonPattern;

/**
 * 单例模式-测试类
 */
public class TestSingleton {
    public static void main(String[] args) {

        SingletonLazySafe ls = SingletonLazySafe.getSingleton();
        ls.doSome2();

        SingletonLazyUnsafe lu = SingletonLazyUnsafe.getSingleton();
        lu.doSome4();

        SingletonHungry h = SingletonHungry.getSingleton();
        h.doSome2();

        SingletonDoubleCheckLock dbc = SingletonDoubleCheckLock.getSingleton();
        dbc.doSome1();

        SingletonEnum e = SingletonEnum.getInstance();
        e.show();
    }
}