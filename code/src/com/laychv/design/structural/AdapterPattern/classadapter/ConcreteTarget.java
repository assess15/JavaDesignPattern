package com.laychv.design.structural.AdapterPattern.classadapter;

/**
 * Target 实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的目标方法!!!");
    }
}
