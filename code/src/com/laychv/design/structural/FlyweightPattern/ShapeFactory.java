package com.laychv.design.structural.FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {

    final static HashMap<String, Shape> map = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
