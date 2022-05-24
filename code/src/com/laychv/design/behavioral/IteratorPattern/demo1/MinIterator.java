package com.laychv.design.behavioral.IteratorPattern.demo1;

import java.util.List;

public class MinIterator implements Iterator {

    private int position;
    private final List<Employee> list;

    public MinIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee employee = list.get(position);
        position++;
        return employee;
    }
}
