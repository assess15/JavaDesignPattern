package com.laychv.design.behavioral.IteratorPattern.demo4;

public class Request1 extends AbstractRequest{

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}