package com.laychv.design.behavioral.CommandPattern.demo1;

public class FastFallCommand implements Command {

    private final TetrisMachine machine;

    public FastFallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
