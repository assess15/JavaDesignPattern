package com.laychv.design.creational.SingletonPattern.breakSingleton;

import com.laychv.design.creational.SingletonPattern.SingletonStaticInnerClass;

import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类-单例模式
 * 破坏方式：
 * 自定义类加载器
 */
public class BreakStaticSingleton2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BreakStaticSingletonClassLoader loader = new BreakStaticSingletonClassLoader();
        Class<?> clazz = Class.forName("SingletonStaticInnerClass",true,loader);
        SingletonStaticInnerClass instance = (SingletonStaticInnerClass) clazz.getDeclaredConstructor().newInstance();
        instance.show();
    }
}
