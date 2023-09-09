package com.start.designpattern.behavioral.StrategyPattern.demo1;

/**
 * 策略模式-测试类
 */
public class MainStrategy {
    public static void main(String[] args) {
        Strategy add = new Strategy(new OperateAdd());
        System.out.println("a + b = " + add.executeOperate(10, 5));

        Strategy subtract = new Strategy(new OperateSubtract());
        System.out.println("a - b = " + subtract.executeOperate(10, 5));

        Strategy multi = new Strategy(new OperateMulti());
        System.out.println("a * b = " + multi.executeOperate(10, 5));

        Strategy divis = new Strategy(new OperateDivis());
        System.out.println("a / b = " + divis.executeOperate(10, 5));
    }
}
