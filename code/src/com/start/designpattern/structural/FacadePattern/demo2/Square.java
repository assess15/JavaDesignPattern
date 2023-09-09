package com.start.designpattern.structural.FacadePattern.demo2;

/**
 * 子系统
 * 画正方形
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("draw : Square");
    }
}
