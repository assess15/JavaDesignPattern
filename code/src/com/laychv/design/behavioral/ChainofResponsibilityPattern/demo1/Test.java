package com.laychv.design.behavioral.ChainofResponsibilityPattern.demo1;

/**
 * 责任链模式
 * 先有手记,再有视频
 */
public class Test {
    public static void main(String[] args) {
        Approver videoApprover = new VideoApprover();
        Approver articleApprover = new ArticleApprover();

        Course course = new Course();
        course.setName("Java设计模式 by Geely");
        course.setArticle("Java设计模式手记");
//        course.setVideo("Java设计模式视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
