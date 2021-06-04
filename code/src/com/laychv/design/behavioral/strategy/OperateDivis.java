package com.laychv.design.behavioral.strategy;

/**
 * 除法
 */
public class OperateDivis implements Operate {
    @Override
    public int doOperate(int a, int b) {
        return a / b;
    }
}
