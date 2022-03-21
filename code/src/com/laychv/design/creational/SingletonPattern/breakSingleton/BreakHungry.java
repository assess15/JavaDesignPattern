package com.laychv.design.creational.SingletonPattern.breakSingleton;

import com.laychv.design.creational.SingletonPattern.SingletonHungry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 破坏饿汉式
 * 反射获取构造方法-成功
 */
public class BreakHungry {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonHungry> clazz = SingletonHungry.class;
        Constructor<SingletonHungry> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonHungry instance = constructor.newInstance();
        instance.doSome2();
    }
}
