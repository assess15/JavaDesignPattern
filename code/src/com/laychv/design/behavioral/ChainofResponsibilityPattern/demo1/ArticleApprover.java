package com.laychv.design.behavioral.ChainofResponsibilityPattern.demo1;

public class ArticleApprover extends Approver {
    @Override
    void deploy(Course course) {
        if (course.getArticle() != null) {
            System.out.println(course.getName() + "含有手记,批准了!!!!");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记,不批准!!!!");
        }
    }
}
