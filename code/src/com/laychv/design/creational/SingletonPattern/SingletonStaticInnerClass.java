package com.laychv.design.creational.SingletonPattern;

/**
 * 静态内部类- 单例模式
 */
public class SingletonStaticInnerClass {
    private SingletonStaticInnerClass() {
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingleHolder.single;
    }

    private static class SingleHolder {
        private static final SingletonStaticInnerClass single = new SingletonStaticInnerClass();
    }

    public void show() {
        System.out.println("成功引起我的注意！！！");
    }

}
