package com.assess15.design.creational.sington;

/**
 * 饿汉式-单例模式
 */
public class SingletonHungry {

    // 饿汉式:先加载,随着类的调用而加载
    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getSingleton() {
        return singleton;
    }
}
