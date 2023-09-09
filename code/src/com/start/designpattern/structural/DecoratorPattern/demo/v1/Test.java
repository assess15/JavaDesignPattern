package com.start.designpattern.structural.DecoratorPattern.demo.v1;

/**
 * 测试类
 *
 * 这种写法可能导致类爆炸
 * 子类不断变多
 */
public class Test {

    public static void main(String[] args) {
        // 原味
        BatterCake bc = new BatterCake();
        System.out.println(bc.getDesc() + "\n" + "售价：" + bc.getCost());
        // 加荷包蛋
        BatterCake egg = new BatterCakeAddAddEgg();
        System.out.println(egg.getDesc() + "\n" + "售价：" + egg.getCost());
        // 加考场
        BatterCake sau = new BatterCakeAddsSausage();
        System.out.println(sau.getDesc() + "\n" + "售价：" + sau.getCost());
    }

}
