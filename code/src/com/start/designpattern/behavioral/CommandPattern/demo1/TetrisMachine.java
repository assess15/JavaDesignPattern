package com.start.designpattern.behavioral.CommandPattern.demo1;

/**
 * 处理具体逻辑
 */
public class TetrisMachine {

    public void toLeft() {
        System.out.println("向左");
    }

    public void toRight() {
        System.out.println("向右");
    }

    public void fastToBottom() {
        System.out.println("快速下落");
    }

    public void transform() {
        System.out.println("改变形状");
    }
}
