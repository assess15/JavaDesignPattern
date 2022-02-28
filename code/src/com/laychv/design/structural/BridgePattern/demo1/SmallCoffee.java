package com.laychv.design.structural.BridgePattern.demo1;

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
