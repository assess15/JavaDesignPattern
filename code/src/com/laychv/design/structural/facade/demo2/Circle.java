package com.laychv.design.structural.facade.demo2;

/**
 * 子系统
 * 画圆
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw : Circle");
    }
}
