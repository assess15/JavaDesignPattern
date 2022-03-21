package com.laychv.design.creational.SingletonPattern;

/**
 * 枚举-单例模式-线程安全
 */
public enum SingletonEnum {
    INSTANCE;

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public void show() {
        System.out.println("枚举单例模式来了!!!");
    }
}