package com.laychv.design.creational.factoryMethod.demo2;

public class PythonVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
