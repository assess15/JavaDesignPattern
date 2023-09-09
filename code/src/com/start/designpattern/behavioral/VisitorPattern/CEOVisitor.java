package com.start.designpattern.behavioral.VisitorPattern;

// CEO访问者,只关注业绩
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 : " + engineer.name + ", KPI : " + engineer.kpi);
    }

    @Override
    public void visit(Manager mgr) {
        System.out.println("经理 : " + mgr.name + ", KPI : " + mgr.kpi + ", 新产品数量 : "
                + mgr.getProducts());
    }
}