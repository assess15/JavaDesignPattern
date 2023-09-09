package com.start.designpattern.behavioral.IteratorPattern.demo1;

public class HuiIterator implements Iterator {

    private int position;
    private final Employee[] arr;

    public HuiIterator(Employee[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return !(position > arr.length - 1 || arr[position] == null);
    }

    @Override
    public Object next() {
        Employee employee = arr[position];
        position++;
        return employee;
    }
}
