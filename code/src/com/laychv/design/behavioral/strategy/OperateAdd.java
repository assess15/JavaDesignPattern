package com.laychv.design.behavioral.strategy;

/**
 * 加法
 */
public class OperateAdd implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a + b;
    }
}
