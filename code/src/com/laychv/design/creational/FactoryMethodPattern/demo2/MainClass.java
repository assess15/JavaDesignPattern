package com.laychv.design.creational.FactoryMethodPattern.demo2;

/**
 * 工厂方法 - 测试
 * 创建对象放在子类中
 */
public class MainClass {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        VideoFactory factory1 = new PythonVideoFactory();
        VideoFactory factory2 = new WebVideoFactory();

        Video video = factory.getVideo();
        video.play();
        Video video1 = factory1.getVideo();
        video1.play();
        Video video2 = factory2.getVideo();
        video2.play();
    }
}
