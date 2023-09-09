package com.start.designpattern.behavioral.IteratorPattern.demo5;

public abstract class Leader {
    protected Leader nextHandler;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }

    public abstract int limit();

    public abstract void handle(int money);
}
