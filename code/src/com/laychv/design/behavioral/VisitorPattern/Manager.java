package com.laychv.design.behavioral.VisitorPattern;

import java.util.Random;

public class Manager extends Staff {

    private final int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
