package com.start.designpattern.behavioral.SubscriberPattern.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 订阅者
 */
@Deprecated(since = "9")
public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("name: " + name + " 收到新邮件啦！！！ " + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
