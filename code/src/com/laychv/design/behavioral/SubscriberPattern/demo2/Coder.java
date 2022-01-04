package com.laychv.design.behavioral.SubscriberPattern.demo2;

import java.util.concurrent.Flow;

/**
 * 订阅者
 */
public class Coder implements Flow.Subscriber<String> {

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(String item) {
        System.out.println(item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
        System.out.println("完毕!");
    }
}
