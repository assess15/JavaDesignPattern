package com.assess15.design.creational.sington;

/**
 * 懒汉式-单例模式-线程安全
 * <p>
 * 通过synchronized方式确保安全,所以效率低
 */
public class SingletonLazySafe {

    private static SingletonLazySafe singleton;

    private SingletonLazySafe() {
    }

    public static synchronized SingletonLazySafe getSingleton() {
        if (singleton == null) {
            singleton = new SingletonLazySafe();
        }
        return singleton;
    }
}
