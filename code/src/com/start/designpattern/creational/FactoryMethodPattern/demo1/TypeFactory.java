package com.start.designpattern.creational.FactoryMethodPattern.demo1;

public class TypeFactory {

    public Type getType(Type type) {
        switch (type) {
            case A: {
                System.out.println("selected A");
                break;
            }
            case B: {
                System.out.println("selected B");
                break;
            }
            case C: {
                System.out.println("selected C");
                break;
            }
            case D: {
                System.out.println("selected D");
                break;
            }
        }
        return type;
    }
}
