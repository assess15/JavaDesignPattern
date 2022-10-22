package com.laychv.design.behavioral.IteratorPattern.demo5;

public class Client {
    public static void main(String[] args) {
        Grouper grouper = new Grouper();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();
        grouper.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;
        grouper.handleRequest(5000);
    }
}