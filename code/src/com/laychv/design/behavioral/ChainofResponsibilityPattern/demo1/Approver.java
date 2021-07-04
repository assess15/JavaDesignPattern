package com.laychv.design.behavioral.ChainofResponsibilityPattern.demo1;

/**
 * 批准者
 * 包含一个同样类型的自己
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    abstract void deploy(Course course);
}
