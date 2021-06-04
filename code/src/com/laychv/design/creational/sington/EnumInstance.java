package com.laychv.design.creational.sington;

/**
 * 枚举-单例模式-线程安全
 */
public enum EnumInstance {
    INSTANCE;

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public void doSome() {
        System.out.println("枚举单例模式来了!!!");
    }
}