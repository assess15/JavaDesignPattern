package com.laychv.design.behavioral.CommandPattern.demo1;

public class Buttons {

    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private FastFallCommand fastFallCommand;
    private TransformCommand transformCommand;

    public void setLeftCommand(LeftCommand left) {
        leftCommand = left;
    }

    public void setRightCommand(RightCommand right) {
        rightCommand = right;
    }

    public void setFastFallCommand(FastFallCommand fastFall) {
        fastFallCommand = fastFall;
    }

    public void setTransformCommand(TransformCommand transform) {
        transformCommand = transform;
    }

    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }

    public void fall() {
        fastFallCommand.execute();
    }

    public void transform() {
        transformCommand.execute();
    }
}
