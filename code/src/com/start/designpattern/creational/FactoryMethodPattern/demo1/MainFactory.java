package com.start.designpattern.creational.FactoryMethodPattern.demo1;

/**
 * 工厂模式-测试类
 */
public class MainFactory {
    public static void main(String[] args) {
        TypeFactory typeFactory = new TypeFactory();
        typeFactory.getType(Type.A);
        typeFactory.getType(Type.B);
        typeFactory.getType(Type.C);
        typeFactory.getType(Type.D);
    }
}
