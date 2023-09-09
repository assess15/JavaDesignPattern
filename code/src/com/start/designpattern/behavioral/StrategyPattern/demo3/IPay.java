package com.start.designpattern.behavioral.StrategyPattern.demo3;

public interface IPay {
    // 支付
    void pay(double money);

    // 支付回调
    void callback(String call);
}
