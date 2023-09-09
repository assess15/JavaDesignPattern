package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 减法
 */
public class OperateSubtract implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a - b;
    }
}
