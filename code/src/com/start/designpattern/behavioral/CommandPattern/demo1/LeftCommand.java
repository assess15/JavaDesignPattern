package com.start.designpattern.behavioral.CommandPattern.demo1;

public class LeftCommand implements Command {

    private final TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
