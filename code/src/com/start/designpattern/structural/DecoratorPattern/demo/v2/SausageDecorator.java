package com.start.designpattern.structural.DecoratorPattern.demo.v2;

/**
 * 具体拓展的装饰器
 * 加烤肠 2块钱
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 烤肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
