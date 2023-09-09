package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 执行操作
 */
public class Strategy {
    Operate operate;

    public Strategy(Operate operate) {
        this.operate = operate;
    }

    public int executeOperate(int a, int b) {
        return operate.doOperate(a, b);
    }
}
