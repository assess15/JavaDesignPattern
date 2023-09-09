package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 乘法
 */
public class OperateMulti implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a * b;
    }
}
