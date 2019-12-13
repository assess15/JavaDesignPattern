package com.assess15.design.creational.easyFactory.demo2;

/**
 * 简单工厂 - 测试
 * 通过反射模式
 */
public class MainClass {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        videoFactory.getVideo(JavaVideo.class).play();
    }
}
