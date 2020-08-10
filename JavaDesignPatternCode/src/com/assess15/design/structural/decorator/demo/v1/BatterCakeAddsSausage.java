package com.assess15.design.structural.decorator.demo.v1;

/**
 * 加烤肠 + 2块钱
 */
public class BatterCakeAddsSausage extends BatterCake{

    @Override
    protected String getDesc() {
        return super.getDesc() + "加烤肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
