package com.laychv.design.creational.abstractFactory.demo1;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Notes getNotes() {
        return new JavaNote();
    }
}
