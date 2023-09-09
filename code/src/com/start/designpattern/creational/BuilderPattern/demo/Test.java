package com.start.designpattern.creational.BuilderPattern.demo;

public class Test {

    public static void main(String[] args) {
        Builder builder = new MacBookProBuilder();
        Director director = new Director(builder);
        director.constructor("华硕主板", "三星显示器");
        System.out.println("Computer info: " + builder.create().toString());
    }
}