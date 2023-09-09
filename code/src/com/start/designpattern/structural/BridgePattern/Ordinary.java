package com.start.designpattern.structural.BridgePattern;

public class Ordinary extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "原味";
    }
}
