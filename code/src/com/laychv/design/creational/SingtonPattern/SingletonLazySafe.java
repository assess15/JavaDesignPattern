package com.laychv.design.creational.SingtonPattern;

/**
 * 懒汉式-单例模式-线程安全
 * synchronized 方法
 * 同步方法
 * <p>
 * 通过synchronized方式确保安全,所以效率低
 * 是否使用 synchronized 修饰 getSingleton()方法。
 * 若使用，就保证了对临界资源的同步互斥访问，也就保证了单例。
 * <p>
 * 每次调用getInstance()同步方法,都会进行同步,消耗不必要的资源,效率低.
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

    public void doSome2() {
        System.out.println("懒汉式-单例模式!!!!");
    }
}
