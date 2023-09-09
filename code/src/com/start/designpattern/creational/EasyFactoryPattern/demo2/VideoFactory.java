package com.start.designpattern.creational.EasyFactoryPattern.demo2;

public class VideoFactory {

    public Video getVideo(Class z) {
        Video video = null;
        try {
            video = (Video) Class.forName(z.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
