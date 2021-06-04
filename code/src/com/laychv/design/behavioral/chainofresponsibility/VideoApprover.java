package com.laychv.design.behavioral.chainofresponsibility;

public class VideoApprover extends Approver {
    @Override
    void deploy(Course course) {
        if (course.getVideo() != null) {
            System.out.println(course.getName() + "含有视频,批准了!!!");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频,不批准!!!!!");
        }
    }
}
