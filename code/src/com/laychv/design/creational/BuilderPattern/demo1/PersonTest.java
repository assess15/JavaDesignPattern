package com.laychv.design.creational.BuilderPattern.demo1;

/**
 * Builder模式
 */
public class PersonTest {
    public static void main(String[] args) {
        Person builder = new Person.Builder()
                .setAge("25")
                .setName("张三")
                .build();
        System.out.println(builder);
    }
}
