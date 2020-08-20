package com.assess15.design.creational.builder.demo2;

/**
 * 建造者模式
 * 关键点:
 * Course的构造方法持有Course的内部类Builder
 * 通过Builder拼接参数
 */
public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course.Builder()
                .buildCourseName("Java设计模式")
                .buildCoursePPT("Java设计模式-PPT")
                .buildCourseVideo("Java设计模式-视频")
                .build();
        System.out.println(course);
    }
}
