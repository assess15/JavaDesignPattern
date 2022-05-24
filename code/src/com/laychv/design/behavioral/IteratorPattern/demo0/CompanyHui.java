package com.laychv.design.behavioral.IteratorPattern.demo0;

public class CompanyHui {

    private final Employee[] arr = new Employee[3];

    public CompanyHui() {
        arr[0] = new Employee("张三", 23, "男", "程序员");
        arr[1] = new Employee("李四", 24, "男", "程序员");
        arr[2] = new Employee("王五", 25, "男", "程序员");
    }

    public Employee[] getEmployee() {
        return arr;
    }
}
