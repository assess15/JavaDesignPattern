package com.start.designpattern.behavioral.MediatorPattern;

public class CPU extends Colleague {

    private String dataSound, dataVideo;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataSound() {
        return dataSound;
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public void decodeData(String data) {
        String[] temp = data.split(",");
        dataSound = temp[0];
        dataVideo = temp[1];
        mediator.change(this);
    }
}
