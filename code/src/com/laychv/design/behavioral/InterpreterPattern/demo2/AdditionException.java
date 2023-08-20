package com.laychv.design.behavioral.InterpreterPattern.demo2;

public class AdditionException extends OperatorException {

    public AdditionException(ArithmeticException exp1, ArithmeticException exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
