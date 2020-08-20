package com.assess15.design.creational.sington;

/**
 * 双重校验锁-单例模式-线程安全
 */
public class SingletonDoubleCheckLock {

    private static volatile SingletonDoubleCheckLock singleton;

    private SingletonDoubleCheckLock() {
    }

    public static SingletonDoubleCheckLock getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheckLock();
                }
            }
        }
        return singleton;
    }
}
