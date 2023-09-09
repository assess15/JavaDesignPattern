package com.start.designpattern.behavioral.CommandPattern.uml;

/**
 * 具体命令角色
 */
public class ConcreteCommand implements Command {

    // 持有一个对接收者对象的引用
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 调用接收者相关方法来执行具体逻辑
        receiver.action();
    }
}
