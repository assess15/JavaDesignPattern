package com.laychv.design.behavioral.VisitorPattern;

import java.util.Random;

/**
 * 员工基类
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name){
        this.name = name;
        kpi = new Random().nextInt();
    }

    public abstract void accept(Visitor visitor);
}
