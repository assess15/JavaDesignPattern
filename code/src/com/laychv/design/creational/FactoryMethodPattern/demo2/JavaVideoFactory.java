package com.laychv.design.creational.FactoryMethodPattern.demo2;

public class JavaVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
