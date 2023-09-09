package com.start.designpattern.behavioral.MementoPattern;

/**
 * 管理Memento
 */
public class Caretaker {
    private Memento memento;

    public void archive(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
