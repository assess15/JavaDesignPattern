package com.start.designpattern.behavioral.VisitorPattern;

import java.util.Random;

public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return new Random().nextInt();
    }
}
