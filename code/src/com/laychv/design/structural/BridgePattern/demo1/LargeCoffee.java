package com.laychv.design.structural.BridgePattern.demo1;

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl + "咖啡");
    }

    @Override
    public String addSomething() {
        return null;
    }
}
