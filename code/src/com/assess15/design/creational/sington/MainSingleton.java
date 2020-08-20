package com.assess15.design.creational.sington;

/**
 * 单例模式-测试类
 */
public class MainSingleton {
    public static void main(String[] args) {

        SingletonLazySafe singletonLazySafe = SingletonLazySafe.getSingleton();

        SingletonLazyUnsafe singletonLazyUnsafe = SingletonLazyUnsafe.getSingleton();

        SingletonHungry singletonHungry = SingletonHungry.getSingleton();

        SingletonDoubleCheckLock singletonDoubleCheckLock = SingletonDoubleCheckLock.getSingleton();

        Object data = EnumInstance.getInstance().getData();
    }
}