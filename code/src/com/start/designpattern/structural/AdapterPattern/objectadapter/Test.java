package com.start.designpattern.structural.AdapterPattern.objectadapter;

/**
 * 对象适配器
 */
public class Test {
    public static void main(String[] args) {
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Target adaptee = new Adapter();
        adaptee.request();
    }
}
