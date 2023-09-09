package com.start.designpattern.behavioral.InterpreterPattern.demo2;

public class OperatorException extends ArithmeticException {

    protected ArithmeticException exp1, exp2;

    public OperatorException(ArithmeticException exp1, ArithmeticException exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
