package com.assess15.design.creational.builder;

public class Test {


    public static void main(String[] args) {
        new Test.Builder().setAge(30).setName("Ju Lei").builder();
    }

    static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Test builder() {
            return new Test();
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
