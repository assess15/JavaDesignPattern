package com.laychv.design.creational.EasyFactoryPattern.demo1;

public class VideoFactory {
    public Video getVideo(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
