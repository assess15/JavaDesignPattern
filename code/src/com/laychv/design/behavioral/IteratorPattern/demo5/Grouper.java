package com.laychv.design.behavioral.IteratorPattern.demo5;

public class Grouper extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销： " + money + "元");
    }
}
