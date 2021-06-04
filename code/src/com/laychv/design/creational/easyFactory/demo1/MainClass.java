package com.laychv.design.creational.easyFactory.demo1;

/**
 * 简单工厂 - 测试
 * 通过传入字符串方式
 */
public class MainClass {
    public static void main(String[] args) {
        Video video = new JavaVideo();
        video.play();

        VideoFactory factory = new VideoFactory();
        factory.getVideo("java").play();
    }
}
