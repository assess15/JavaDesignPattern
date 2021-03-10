package com.assess15.design.creational.sington;

/**
 * synchronized 块
 * 同步代码块
 * 每次调用getInstance()同步方法,都会进行同步,消耗不必要的资源,效率低.
 */
public class SingletonLazySafe2 {

    private static SingletonLazySafe2 safe;

    private SingletonLazySafe2() {
    }

    public static SingletonLazySafe2 getInstance() {
        synchronized (SingletonLazySafe2.class) {
            if (safe == null) {
                safe = new SingletonLazySafe2();
            }
        }
        return safe;
    }
}
