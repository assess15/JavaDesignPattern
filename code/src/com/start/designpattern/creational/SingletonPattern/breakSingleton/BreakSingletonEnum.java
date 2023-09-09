package com.start.designpattern.creational.SingletonPattern.breakSingleton;

import com.start.designpattern.creational.SingletonPattern.SingletonEnum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * NoSuchMethodException
 * 枚举不怕反射攻击
 */
public class BreakSingletonEnum {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SingletonEnum> clazz = SingletonEnum.class;
        Constructor<SingletonEnum> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonEnum singletonEnum = constructor.newInstance();
        singletonEnum.show();
    }
}
