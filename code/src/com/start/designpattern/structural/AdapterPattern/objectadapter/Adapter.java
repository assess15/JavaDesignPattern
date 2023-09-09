package com.start.designpattern.structural.AdapterPattern.objectadapter;

public class Adapter implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
