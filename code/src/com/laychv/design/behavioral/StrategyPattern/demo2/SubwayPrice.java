package com.laychv.design.behavioral.StrategyPattern.demo2;

public class SubwayPrice implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int total = km + 5;
        return total;
    }
}
