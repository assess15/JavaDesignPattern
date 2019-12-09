package com.assess15.design.builder;

/**
 * Builder模式
 */
public class BuilderDesign {

    String age;
    String name;

    BuilderDesign(Builder builder) {
        age = builder.age;
        name = builder.name;
    }

    public static class Builder {

        String name;
        String age;

        public Builder setName(String n) {
            name = n;
            return this;
        }

        public Builder setAge(String a) {
            age = a;
            return this;
        }

        public BuilderDesign builder() {
            return new BuilderDesign(this);
        }
    }

}
