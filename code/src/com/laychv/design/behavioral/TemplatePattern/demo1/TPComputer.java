package com.laychv.design.behavioral.TemplatePattern.demo1;

public class TPComputer extends Computer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查防火墙！！！");
    }

    @Override
    protected void login() {
        System.out.println("TP电脑需要指纹登录！！！！");
    }
}
