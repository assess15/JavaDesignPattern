package com.laychv.design.UML;

/**
 * 类与类关系
 * 1. 泛化：Java中的继承，父类与子类，接口与接口
 * <p>
 * 创建一个Class后，默认拥有哪些方法
 * getClass(),hashCode(),equals(),toString(),notify(),notifyAll(),wait()
 */
public class Generic {
    public static void main(String[] args) {
        Son son = new Son();
        ASon aSon = new ASon();
        System.out.println(son.equals(aSon));
    }
}

/**
 * 类与类的继承关系
 */
class Father {
    String name;
    int age;
}

class Son extends Father {
    void df() throws InterruptedException {
        this.getClass();
        this.hashCode();
        this.equals("");
        this.toString();
        this.notify();
        this.notifyAll();
        this.wait();
    }
}

/**
 * interface与interface继承关系
 * interface 不会默认拥有Object中方法
 */
interface IFather {

}

interface ISubSon extends IFather {

}

/**
 * abstract与类的继承关系
 */
abstract class AFather {

}

class ASon extends AFather {

}



