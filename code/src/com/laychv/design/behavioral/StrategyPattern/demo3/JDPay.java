package com.laychv.design.behavioral.StrategyPattern.demo3;

/**
 * 京东支付
 */
public class JDPay implements IPay {

    @Override
    public void pay(double money) {
        System.out.println("京东支付: " + money);
    }

    @Override
    public void callback(String call) {

    }
}
