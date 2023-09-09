package com.start.designpattern.creational.SingletonPattern;

/**
 * ThreadLocal 线程单例模式
 */
public class SingletonThreadLocal {
    private static final ThreadLocal<SingletonThreadLocal> tl = new ThreadLocal<SingletonThreadLocal>() {
        @Override
        protected SingletonThreadLocal initialValue() {
            return new SingletonThreadLocal();
        }
    };

    private SingletonThreadLocal() {
    }

    public static SingletonThreadLocal getInstance() {
        return tl.get();
    }
}
