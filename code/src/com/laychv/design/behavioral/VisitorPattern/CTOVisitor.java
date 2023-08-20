package com.laychv.design.behavioral.VisitorPattern;

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 :" + engineer.name + ",代码函数:" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("经理 : " + leader.name + "产品数量 : " + leader.getProducts());
    }
}
