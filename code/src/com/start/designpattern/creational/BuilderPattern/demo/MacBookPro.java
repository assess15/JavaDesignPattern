package com.start.designpattern.creational.BuilderPattern.demo;

public class MacBookPro extends Computer {
    protected MacBookPro() {}
    @Override
    public void setOS() {
        mOS = "MAC OS X 12.3.1";
    }
}