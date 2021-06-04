package com.laychv.design.creational.factoryMethod.demo2;

public class JavaVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
