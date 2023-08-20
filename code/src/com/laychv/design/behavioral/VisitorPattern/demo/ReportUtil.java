package com.laychv.design.behavioral.VisitorPattern.demo;

class ReportUtil {
    public void visit(Staff staff) {
        if (staff instanceof Manager) {
            Manager mgr = (Manager) staff;
            System.out.println("经理 : " + mgr.name + ", KPI : " + mgr.kpi + ", 新产品数量 :" + mgr.getProducts());
        } else {
            Engineer engineer = (Engineer) staff;
            System.out.println("工程师 : " + engineer.name + ", KPI : " + engineer.kpi);
        }
    }
}