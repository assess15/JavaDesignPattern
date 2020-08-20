package com.assess15.design.structural.adapter.objectadapter;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
