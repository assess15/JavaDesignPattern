package com.laychv.design.behavioral.IteratorPattern.demo3;

/**
 * 具体处理者角色，对请求进行处理，如果不能处理则将该请求转发给下一个节点上的处理对象。
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled !!!! ");
            return;
        } else {
            successor.handleRequest(condition);// 处理下一个节点
        }
    }
}
