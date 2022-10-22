package com.laychv.design.behavioral.IteratorPattern.demo4;

public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2 handle request: " + request.getRequestLevel());
    }
}