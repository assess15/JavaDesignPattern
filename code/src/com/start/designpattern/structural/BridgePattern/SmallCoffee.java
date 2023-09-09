package com.start.designpattern.structural.BridgePattern;

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯" + impl + "咖啡");
    }

    @Override
    public String addSomething() {
        return null;
    }
}
