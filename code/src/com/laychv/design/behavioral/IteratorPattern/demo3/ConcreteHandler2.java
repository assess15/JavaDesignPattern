package com.laychv.design.behavioral.IteratorPattern.demo3;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handled !!!! ");
            return;
        } else {
            successor.handleRequest(condition);// 处理下一个节点
        }
    }
}
