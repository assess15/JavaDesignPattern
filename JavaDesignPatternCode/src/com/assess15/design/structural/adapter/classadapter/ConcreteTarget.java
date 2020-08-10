package com.assess15.design.structural.adapter.classadapter;

/**
 * Target 实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的目标方法!!!");
    }
}
