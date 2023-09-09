package com.start.designpattern.structural.BridgePattern;

/**
 * 案例：
 * 大杯加糖，大杯不加糖，小杯加糖，小杯不加糖
 * 使用桥接设计模式
 */
public abstract class Coffee extends CoffeeAdditives {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 添加具体是什么样的由子类决定
     */
    public abstract void makeCoffee();
}
