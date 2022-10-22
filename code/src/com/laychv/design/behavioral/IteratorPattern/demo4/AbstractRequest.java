package com.laychv.design.behavioral.IteratorPattern.demo4;

public abstract class AbstractRequest {
    protected Object obj;// 处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    // 获取处理的内容对象
    public Object getContent() {
        return obj;
    }

    // 获取请求级别
    public abstract int getRequestLevel();
}