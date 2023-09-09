package com.start.designpattern.creational.BuilderPattern.demo3;

public class MacBookPro {

    private String os;
    private String cpu;
    private String memory;

    public MacBookPro(Builder builder) {
        this.os = builder.os;
        this.cpu = builder.cpu;
        this.memory = builder.memory;
    }

    public static void main(String[] args) {
        MacBookPro mbp = new Builder()
                .setOS("Big Sur")
                .setCPU("I7-9000H")
                .setMemory("32G")
                .create();

        System.out.println(mbp);
    }

    @Override
    public String toString() {
        return "MacBookPro{" +
                "os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    static class Builder {
        private String os;
        private String cpu;
        private String memory;

        public Builder setOS(String os) {
            this.os = os;
            return this;
        }

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public MacBookPro create() {
            return new MacBookPro(this);
        }
    }
}
