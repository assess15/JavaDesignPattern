package com.laychv.design.behavioral.IteratorPattern.demo5;

public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销：" + money + "元");
    }
}
