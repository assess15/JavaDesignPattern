package com.laychv.design.behavioral.InterpreterPattern.demo2;

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
