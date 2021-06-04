package com.laychv.design.structural.decorator.demo.v2;

/**
 * 具体拓展的装饰器
 * 加荷包蛋 2块钱
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 荷包蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
