package com.laychv.design.structural.decorator.demo.v1;

/**
 * 加荷包蛋 + 2块钱
 */
public class BatterCakeAddAddEgg extends BatterCake{

    @Override
    protected String getDesc() {
        return super.getDesc() + "加荷包蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
