package com.laychv.design.behavioral.StrategyPattern.demo2;

/**
 * 测试策略模式
 */
public class Test {
    public static void main(String[] args) {
        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new BusPrice());
        calculator.setStrategy(new TaxiPrice());
        System.out.println(calculator.calculatePrice(19));
    }
}
