package com.start.designpattern.structural.DecoratorPattern.demo2;

/**
 * @link https://www.runoob.com/design-pattern/decorator-pattern.html
 */
public class Test {
    public static void main(String[] args) {

        ShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());
        redShapeDecorator.draw();

        ShapeDecorator decorator = new RedShapeDecorator(new Rectangle());
        decorator.draw();
    }
}
