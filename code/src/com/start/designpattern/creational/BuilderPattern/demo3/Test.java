package com.start.designpattern.creational.BuilderPattern.demo3;

public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setAge(30).setName("Ju Lei").builder();
        System.out.println(builder);
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
