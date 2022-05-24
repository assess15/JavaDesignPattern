package com.laychv.design.creational.BuilderPattern.demo;

public class MacBookProBuilder extends Builder {
    private Computer mComputer = new MacBookPro();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}