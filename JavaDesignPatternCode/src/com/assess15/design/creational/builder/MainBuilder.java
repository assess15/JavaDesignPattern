package com.assess15.design.creational.builder;

public class MainBuilder {

    public static void main(String[] args) {

        BuilderDesign builder = new BuilderDesign.Builder().setAge("a").setName("aaa").builder();

    }
}
