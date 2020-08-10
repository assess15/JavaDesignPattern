package com.assess15.design.structural.adapter.objectadapter;

public class Adapter implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
