package com.laychv.design.creational.FactoryMethodPattern.demo2;

public class PythonVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
