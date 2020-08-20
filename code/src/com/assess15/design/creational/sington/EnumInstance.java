package com.assess15.design.creational.sington;

/**
 * 枚举-单例模式-线程安全
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}