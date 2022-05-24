package com.laychv.design.creational.BuilderPattern.demo;

public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void constructor(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}