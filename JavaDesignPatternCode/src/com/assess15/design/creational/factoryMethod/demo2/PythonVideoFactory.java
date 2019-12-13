package com.assess15.design.creational.factoryMethod.demo2;

public class PythonVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
