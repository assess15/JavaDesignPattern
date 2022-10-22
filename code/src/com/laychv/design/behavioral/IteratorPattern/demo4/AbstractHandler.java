package com.laychv.design.behavioral.IteratorPattern.demo4;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;// 下一节点处理对象

    // 请求对象
    public final void handleRequest(AbstractRequest request) {
        if (getHandlerLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("");
            }
        }
    }

    // 获取处理者对象的处理级别
    protected abstract int getHandlerLevel();

    // 每个处理者对象的具体处理方式
    protected abstract void handle(AbstractRequest request);
}