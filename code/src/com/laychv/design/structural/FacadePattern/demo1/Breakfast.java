package com.laychv.design.structural.FacadePattern.demo1;

/**
 * 外观类
 * 早餐
 */
public class Breakfast {
    private final BatterCake batterCake;
    private final EggFilling eggFilling;

    public Breakfast() {
        batterCake = new BatterCake();
        eggFilling = new EggFilling();
    }

    public void eatBatterCake() {
        batterCake.addEgg();
        batterCake.addSausage();
    }

    public void eatEggFilling() {
        eggFilling.addEgg();
        eggFilling.addSausage();
    }
}
