package com.laychv.design.structural.decorator.demo.v1;

/**
 * 原味煎饼果子5块钱
 */
public class BatterCake {
    protected String getDesc() {
        return "原味煎饼果子 = 煎饼 + 鸡蛋 + 生菜";
    }

    protected int getCost() {
        return 5;
    }
}