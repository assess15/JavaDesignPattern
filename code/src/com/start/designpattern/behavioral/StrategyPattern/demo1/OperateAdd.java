package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 加法
 */
public class OperateAdd implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a + b;
    }
}
