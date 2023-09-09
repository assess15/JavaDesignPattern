package com.start.designpattern.creational.FactoryMethodPattern.demo2;

public class WebVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new WebVideo();
    }
}
