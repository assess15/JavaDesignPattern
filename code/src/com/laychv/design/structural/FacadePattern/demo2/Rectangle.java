package com.laychv.design.structural.FacadePattern.demo2;

/**
 * 子系统
 * 画三角形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw : Rectangle");
    }
}
