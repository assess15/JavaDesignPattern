package com.laychv.design.structural.flyweight;

public class Circle implements Shape {

    private String color;
    private int radius;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}');
    }
}
