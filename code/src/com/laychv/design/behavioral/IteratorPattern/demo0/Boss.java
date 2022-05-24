package com.laychv.design.behavioral.IteratorPattern.demo0;

import java.util.List;

public class Boss {
    public static void main(String[] args) {
        CompanyMin min = new CompanyMin();
        List<Employee> mins = min.getEmployee();
        for (Employee value : mins) {
            System.out.println(value.toString());
        }
        CompanyHui hui = new CompanyHui();
        Employee[] huis = hui.getEmployee();
        for (Employee employee : huis) {
            System.out.println(employee.toString());
        }
    }
}
