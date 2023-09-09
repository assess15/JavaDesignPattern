package com.start.designpattern.behavioral.TemplatePattern.demo1;

public abstract class Computer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("检查硬件...");
    }

    protected void loadOS() {
        System.out.println("载入系统......");
    }

    protected void login() {
        System.out.println("直接进入系统！!!");
    }

    public final void startUp() {
        System.out.println("开机");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("关机");
    }
}
