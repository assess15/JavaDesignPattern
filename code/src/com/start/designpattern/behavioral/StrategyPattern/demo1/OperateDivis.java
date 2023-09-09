package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 除法
 */
public class OperateDivis implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a / b;
    }
}
