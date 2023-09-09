package com.start.designpattern.behavioral.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        MainBoard board = new MainBoard();

        CPU cpu = new CPU(board);
        GraphicDevice graphic = new GraphicDevice(board);
        SoundDevice sound = new SoundDevice(board);
        CDDevice cd = new CDDevice(board);

        board.setCpu(cpu);
        board.setCdDevice(cd);
        board.setSoundDevice(sound);
        board.setGraphicDevice(graphic);

        cd.load();
    }
}
