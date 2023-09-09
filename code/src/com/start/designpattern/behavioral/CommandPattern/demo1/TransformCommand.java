package com.start.designpattern.behavioral.CommandPattern.demo1;

public class TransformCommand implements Command {

    private final TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.transform();
    }
}
