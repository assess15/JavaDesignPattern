package com.start.designpattern.creational.BuilderPattern.demo1;

/**
 * Builder模式
 */
public class Person {

    final String age;
    final String name;

    Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "BuilderDesign{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String age;

        public Builder setName(String n) {
            name = n;
            return this;
        }

        public Builder setAge(String a) {
            age = a;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
