package com.laychv.design.behavioral.StrategyPattern.demo3;

/**
 * 支付策略选择
 */
public class Strategy {

    IPay pay;

    public Strategy(IPay pay) {
        this.pay = pay;
    }

    public void setPayType(IPay pay) {
        this.pay = pay;
    }

    public void payMoney(double money) {
        pay.pay(money);
    }

    public void payCallback(String call) {
        pay.callback(call);
    }
}
