package com.laychv.design.creational.sington;

/**
 * 懒汉式-单例模式
 * 线程不安全
 */
public class SingletonLazyUnsafe {

    private static SingletonLazyUnsafe singleton;

    private SingletonLazyUnsafe() {
    }

    public static SingletonLazyUnsafe getSingleton() {
        if (singleton == null) {
            // 懒汉式:后加载
            singleton = new SingletonLazyUnsafe();
        }
        return singleton;
    }

    public void doSome4() {
        System.out.println("懒汉式!!!");
    }
}
