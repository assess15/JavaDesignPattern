package com.start.designpattern.behavioral.CommandPattern.uml;

/**
 * 请求调用者
 */
public class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
