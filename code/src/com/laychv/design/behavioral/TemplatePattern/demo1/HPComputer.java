package com.laychv.design.behavioral.TemplatePattern.demo1;

public class HPComputer extends Computer {
    @Override
    protected void login() {
        System.out.println("惠普电脑需要输入用户名，密码才能登录！！！");
    }
}
