package com.laychv.design.behavioral.StrategyPattern.demo2;

/**
 * 公交车价格计算策略
 */
public class BusPrice implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int total = km + 10;
        return total;
    }
}
