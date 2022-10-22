package com.laychv.design.behavioral.IteratorPattern.demo4;

public class Request2 extends AbstractRequest{

    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}