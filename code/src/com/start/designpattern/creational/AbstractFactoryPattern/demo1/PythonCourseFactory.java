package com.start.designpattern.creational.AbstractFactoryPattern.demo1;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Notes getNotes() {
        return new PythonNote();
    }
}
