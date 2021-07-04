package com.laychv.design.structural.DecoratorPattern.demo.v2;

/**
 * 使用装饰者模式
 * 抽象类 + 抽象方法
 * 对实体类BatterCake进行装饰,通过抽象的方式
 */
public abstract class AbstractBatterCake {
    protected abstract String getDesc();
    protected abstract int getCost();
}
