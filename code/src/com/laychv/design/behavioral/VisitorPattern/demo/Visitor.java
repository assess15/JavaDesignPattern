package com.laychv.design.behavioral.VisitorPattern.demo;

public interface Visitor {
    // 访问工程师类型
    public void visit(Engineer engineer);

    // 访问经理类型
    public void visit(Manager leader);
}