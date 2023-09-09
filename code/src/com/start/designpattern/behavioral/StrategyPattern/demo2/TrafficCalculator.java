package com.start.designpattern.behavioral.StrategyPattern.demo2;

/**
 * 配置交通费策略
 */
public class TrafficCalculator {

    private CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }
}
