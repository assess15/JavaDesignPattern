package com.laychv.design.creational.SingletonPattern.breakSingleton;

import com.laychv.design.creational.SingletonPattern.SingletonStaticInnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类单例模式
 * 破坏方式：
 * 反射
 */
public class BreakStaticSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonStaticInnerClass instance1 = SingletonStaticInnerClass.getInstance();

        Class<SingletonStaticInnerClass> clazz = SingletonStaticInnerClass.class;
        Constructor<SingletonStaticInnerClass> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonStaticInnerClass instance2 = constructor.newInstance();
        if (instance1 == instance2) {
            System.out.println("反射失败！！！，因为是同一个实例");
        } else {
            System.out.println("反射成功！！！，因为是不同的实例");
        }
        instance1.show();
        instance2.show();
    }
}
