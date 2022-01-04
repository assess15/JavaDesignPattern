package com.laychv.design.behavioral.SubscriberPattern.demo1;

public class Test {
    public static void main(String[] args) {
        // 发布者
        Gmail gmail = new Gmail();
        // 订阅者
        Coder java = new Coder("Java-Coder");
        Coder cpp = new Coder("C++-Coder");
        // 将订阅者添加到发布者列表中
        gmail.addObserver(java);
        gmail.addObserver(cpp);
        // 发布消息
        gmail.post("今晚全员加班");
    }
}
