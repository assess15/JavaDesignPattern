package com.start.designpattern.behavioral.InterpreterPattern.demo2;

public class SubtractionException extends OperatorException {

    public SubtractionException(ArithmeticException exp1, ArithmeticException exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
