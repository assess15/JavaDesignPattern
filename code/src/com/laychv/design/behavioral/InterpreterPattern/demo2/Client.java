package com.laychv.design.behavioral.InterpreterPattern.demo2;

public class Client {

    public static void main(String[] args) {
        Calculator add = new Calculator("199 + 388 + 110");
        System.out.println(add.calculate());

        Calculator sub = new Calculator("388 - 199 - 110");
        System.out.println(sub.calculate());
    }
}
