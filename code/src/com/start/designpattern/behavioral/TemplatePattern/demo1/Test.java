package com.start.designpattern.behavioral.TemplatePattern.demo1;

public class Test {
    public static void main(String[] args) {
        HPComputer hpComputer = new HPComputer();
        hpComputer.startUp();

        TPComputer tpComputer = new TPComputer();
        tpComputer.startUp();
    }
}
