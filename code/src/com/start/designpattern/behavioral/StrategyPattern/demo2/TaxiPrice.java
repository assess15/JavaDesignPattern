package com.start.designpattern.behavioral.StrategyPattern.demo2;

public class TaxiPrice implements CalculateStrategy {

    @Override
    public int calculatePrice(int km) {
        int total = km + 90;
        return total;
    }
}
