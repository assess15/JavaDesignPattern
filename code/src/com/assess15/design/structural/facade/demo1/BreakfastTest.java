package com.assess15.design.structural.facade.demo1;

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
