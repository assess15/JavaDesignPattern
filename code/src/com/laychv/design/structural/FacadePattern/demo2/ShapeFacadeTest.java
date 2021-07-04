package com.laychv.design.structural.FacadePattern.demo2;

/**
 * 外观模式测试类
 */
public class ShapeFacadeTest {
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();
        facade.drawCircle();
        facade.drawSquare();
        facade.drawRectangle();
    }
}