package com.assess15.design.behavioral.strategy;

/**
 * 乘法
 */
public class OperateMulti implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a * b;
    }
}
