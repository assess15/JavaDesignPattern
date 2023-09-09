package com.start.designpattern.behavioral.CommandPattern.uml;

/**
 * 客户端调用
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
