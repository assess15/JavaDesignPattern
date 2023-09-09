package com.start.designpattern.behavioral.IteratorPattern.demo1;

public class Boss {
    public static void main(String[] args) {
        CompanyMin min = new CompanyMin();
        check(min.iterator());
        CompanyHui hui = new CompanyHui();
        check(hui.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
