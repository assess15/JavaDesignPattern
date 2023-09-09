package com.start.designpattern.creational.SingletonPattern.protectSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类
 * 防止被反射获取
 */
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {
        if (SingleHolder.single != null) {
            throw new RuntimeException("不允许反射创建哦！");
        }
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingleHolder.single;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonStaticInnerClass> clazz = SingletonStaticInnerClass.class;
        Constructor<SingletonStaticInnerClass> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonStaticInnerClass instance = constructor.newInstance();
        instance.show();
    }

    public void show() {
        System.out.println("成功引起我的注意！！！");
    }

    private static class SingleHolder {
        private static final SingletonStaticInnerClass single = new SingletonStaticInnerClass();
    }
}
