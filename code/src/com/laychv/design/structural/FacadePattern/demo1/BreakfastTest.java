package com.laychv.design.structural.FacadePattern.demo1;

/**
 * 客户吃早餐
 */
public class BreakfastTest {
    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();
        breakfast.eatBatterCake();
        breakfast.eatEggFilling();
    }
}
