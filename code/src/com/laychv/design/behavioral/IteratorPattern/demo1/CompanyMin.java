package com.laychv.design.behavioral.IteratorPattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company {
    private final List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("Jerry", 23, "男", "Android开发"));
        list.add(new Employee("Carry", 25, "男", "iOS开发"));
        list.add(new Employee("Jim", 24, "女", "测试"));
        list.add(new Employee("Joye", 24, "女", "设计师"));
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
