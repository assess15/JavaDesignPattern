package com.laychv.design.creational.SingletonPattern;

/**
 * 饿汉式-单例模式
 * 线程安全
 * 在类加载时候已经加载好了
 */
public class SingletonHungry {

    // 饿汉式:先加载,随着类的调用而加载
    // 声明final,类加载完成时,完成赋值
    private final static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getSingleton() {
        return singleton;
    }

    public void doSome2() {
        System.out.println("饿汉式!!!!");
    }
}
