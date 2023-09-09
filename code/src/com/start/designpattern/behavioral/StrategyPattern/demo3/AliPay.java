package com.start.designpattern.behavioral.StrategyPattern.demo3;

/**
 * 阿里支付
 */
public class AliPay implements IPay {

    @Override
    public void pay(double money) {
        System.out.println("阿里支付金额: " + money);
    }

    @Override
    public void callback(String call) {
        System.out.println("阿里支付状态: " + call);
    }
}
