package com.start.designpattern.behavioral.CommandPattern.demo1;

public class Player {

    public static void main(String[] args) {
        TetrisMachine machine = new TetrisMachine();
        LeftCommand left = new LeftCommand(machine);
        RightCommand right = new RightCommand(machine);
        FastFallCommand fall = new FastFallCommand(machine);
        TransformCommand transform = new TransformCommand(machine);

        Buttons buttons = new Buttons();
        buttons.setLeftCommand(left);
        buttons.setRightCommand(right);
        buttons.setFastFallCommand(fall);
        buttons.setTransformCommand(transform);

        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();

        // 直接通过命令调用
        TetrisMachine machine1 = new TetrisMachine();
        machine1.toLeft();
        machine1.toRight();
        machine1.fastToBottom();
        machine1.transform();
    }
}
