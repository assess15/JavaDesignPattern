package com.assess15.design.creational.abstractFactory.demo1;

/**
 * 抽象工厂- 测试类
 */
public class MainClass {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Notes notes = factory.getNotes();
        video.play();
        notes.write();

        PythonCourseFactory factory1 = new PythonCourseFactory();
        Notes notes1 = factory1.getNotes();
        notes1.write();
        Video video1 = factory1.getVideo();
        video1.play();
    }
}
