package com.start.designpattern.structural.FacadePattern.demo2;

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
