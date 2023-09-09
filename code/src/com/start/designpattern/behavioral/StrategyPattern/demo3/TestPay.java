package com.start.designpattern.behavioral.StrategyPattern.demo3;

public class TestPay {
    public static void main(String[] args) {
        final Strategy ali = new Strategy(new AliPay());
        ali.payMoney(0.99);
        ali.payCallback("支付成功!");
    }
}
