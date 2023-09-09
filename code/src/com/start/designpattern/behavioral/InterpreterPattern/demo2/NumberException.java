package com.start.designpattern.behavioral.InterpreterPattern.demo2;

public class NumberException extends ArithmeticException {

    private int number;

    public NumberException(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
