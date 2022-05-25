package com.laychv.design.behavioral.MediatorPattern;

public class GraphicDevice extends Colleague {

    public GraphicDevice(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }
}
