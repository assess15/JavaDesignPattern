package com.laychv.design.creational.factoryMethod.demo2;

public class WebVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new WebVideo();
    }
}
