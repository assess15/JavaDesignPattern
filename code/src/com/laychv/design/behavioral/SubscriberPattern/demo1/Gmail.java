package com.laychv.design.behavioral.SubscriberPattern.demo1;

import java.util.Observable;

/**
 * 被观察者
 * 发布者
 */
@Deprecated(since = "9")
public class Gmail extends Observable {

    public void post(String content) {
        // 标识状态或内容发生变换
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
