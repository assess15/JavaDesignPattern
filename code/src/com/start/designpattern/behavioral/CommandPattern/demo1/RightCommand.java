package com.start.designpattern.behavioral.CommandPattern.demo1;

public class RightCommand implements Command {

    private final TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
