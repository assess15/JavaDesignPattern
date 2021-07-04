package com.laychv.design.structural.AdapterPattern.objectadapter;

public class Adapter implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
