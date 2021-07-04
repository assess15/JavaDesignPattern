package com.laychv.design.structural.DecoratorPattern.demo.v2;

/**
 * 原味煎饼果子 5块钱
 * 实体类模型
 */
public class BatterCake extends AbstractBatterCake {
    @Override
    protected String getDesc() {
        return "原味煎饼果子";
    }

    @Override
    protected int getCost() {
        return 5;
    }
}
