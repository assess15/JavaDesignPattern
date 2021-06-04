package com.laychv.design.creational.sington;

/**
 * 单例模式-测试类
 */
public class MainSingleton {
    public static void main(String[] args) {

        SingletonLazySafe ls = SingletonLazySafe.getSingleton();
        ls.doSome2();

        SingletonLazyUnsafe lu = SingletonLazyUnsafe.getSingleton();
        lu.doSome4();

        SingletonHungry h = SingletonHungry.getSingleton();
        h.doSome2();

        SingletonDoubleCheckLock dbc = SingletonDoubleCheckLock.getSingleton();
        dbc.doSome1();

        EnumInstance e = EnumInstance.getInstance();
        e.doSome();
    }
}