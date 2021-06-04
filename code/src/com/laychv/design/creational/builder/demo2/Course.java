package com.laychv.design.creational.builder.demo2;

/**
 * 实体类 + 实体类建造者
 */
public class Course {
    private final String courseName;
    private final String coursePPT;
    private final String courseVideo;
    private final String courseArticle;
    private final String courseQA;

    // 通过构造方法 关联
    public Course(Builder builder) {
        this.courseArticle = builder.courseArticle;
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseQA = builder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }


    public static class Builder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public Builder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public Builder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public Builder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Builder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
