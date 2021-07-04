package com.laychv.design.structural.DecoratorPattern.demo.v2;

/**
 * 抽象装饰器
 * 关联抽象类，实体类，组合的方式，构造方法
 * 持有BatterCake的抽象类
 */
public class AbstractDecorator extends AbstractBatterCake {

    protected final AbstractBatterCake batterCake;

    public AbstractDecorator(AbstractBatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getDesc() {
        return this.batterCake.getDesc();
    }

    @Override
    protected int getCost() {
        return batterCake.getCost();
    }
}
