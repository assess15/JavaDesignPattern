package com.laychv.design.structural.DecoratorPattern.demo3;

public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
