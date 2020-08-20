package com.assess15.design.structural.decorator.demo.v2;

/**
 * 装饰器模式测试类
 */
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);// 加荷包蛋
        batterCake = new EggDecorator(batterCake);// 再加荷包蛋
        batterCake = new SausageDecorator(batterCake);// 加烤肠
        System.out.println(batterCake.getDesc() + "\n售价 = " + batterCake.getCost());
    }
}
