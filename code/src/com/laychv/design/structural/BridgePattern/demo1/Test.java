package com.laychv.design.structural.BridgePattern.demo1;

public class Test {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
        Sugar sugar = new Sugar();
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();
        SmallCoffee smallCoffee =  new SmallCoffee(sugar);
        smallCoffee.makeCoffee();
        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);
        largeCoffee1.makeCoffee();
        SmallCoffee smallCoffee1 = new SmallCoffee(ordinary);
        smallCoffee1.makeCoffee();
    }
}
