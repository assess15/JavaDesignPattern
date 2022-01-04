package com.laychv.design.behavioral.SubscriberPattern.demo2;

import java.util.concurrent.Flow;

/**
 * 发布者
 */
public class Gmail implements Flow.Publisher<String> {
    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscriber.onNext("Java-Coder");
        subscriber.onNext("C++-Coder");
        subscriber.onNext("C-Coder");

        subscriber.onSubscribe(new Flow.Subscription() {
            @Override
            public void request(long n) {
                System.out.println(n);
            }

            @Override
            public void cancel() {

            }
        });

        subscriber.onComplete();
    }
}
