package com.assess15.design.behavioral.chainofresponsibility;

public class Course {
    String video;
    String name;
    String article;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Course{" +
                "video='" + video + '\'' +
                ", name='" + name + '\'' +
                ", article='" + article + '\'' +
                '}';
    }
}
