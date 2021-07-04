package com.laychv.design.structural.FacadePattern.demo2;

/**
 * 门面类
 */
public class ShapeFacade {

    private final Circle circle;
    private final Square square;
    private final Rectangle rectangle;

    public ShapeFacade() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
