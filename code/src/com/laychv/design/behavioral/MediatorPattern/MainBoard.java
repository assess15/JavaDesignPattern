package com.laychv.design.behavioral.MediatorPattern;

public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private SoundDevice soundDevice;
    private GraphicDevice graphicDevice;

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundDevice(SoundDevice soundDevice) {
        this.soundDevice = soundDevice;
    }

    public void setGraphicDevice(GraphicDevice graphicDevice) {
        this.graphicDevice = graphicDevice;
    }

    @Override
    public void change(Colleague c) {
        if (c == cpu) {
            soundDevice.soundPlay(cpu.getDataSound());
            graphicDevice.videoPlay(cpu.getDataVideo());
        } else if (c == cdDevice) {
            cpu.decodeData(cdDevice.read());
        }
    }
}
