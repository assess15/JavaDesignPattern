package com.laychv.design.behavioral.IteratorPattern.demo3;

/**
 * 抽象处理者角色：声明一个请求处理的方法，
 * 并在其中保持一个对下一个处理节点Handler对象引用。
 **/
public abstract class Handler {
    // 下一个节点处理者
    protected Handler successor;

    // 请求处理
    public abstract void handleRequest(String condition);
}