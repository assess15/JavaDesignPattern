package com.laychv.design.behavioral.MediatorPattern;

public class SoundDevice extends Colleague {

    public SoundDevice(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
