package com.start.designpattern.behavioral.IteratorPattern.demo3;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler3")) {
            System.out.println("ConcreteHandler3 handled !!!! ");
            return;
        } else {
            successor.handleRequest(condition);// 处理下一个节点
        }
    }
}
