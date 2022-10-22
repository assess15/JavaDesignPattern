package com.laychv.design.behavioral.IteratorPattern.demo3;

public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();

        // 设置下一个节点
        handler1.successor = handler2;
        handler2.successor = handler3;

        handler1.handleRequest("ConcreteHandler3");
    }
}
