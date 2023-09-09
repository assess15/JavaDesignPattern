package com.start.designpattern.behavioral.SubscriberPattern.demo2;

public class TestFlow {
    public static void main(String[] args) {
        final Coder coder = new Coder();
        final Gmail gmail = new Gmail();
        gmail.subscribe(coder);
    }
}
