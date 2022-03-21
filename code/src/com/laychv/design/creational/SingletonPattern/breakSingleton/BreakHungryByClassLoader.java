package com.laychv.design.creational.SingletonPattern.breakSingleton;

import com.laychv.design.creational.SingletonPattern.SingletonHungry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 破坏方式
 * 类加载器
 * 双亲委派模型的实现核心方法是loadClass()、findClass()和defineClass()，
 * 其中loadClass()是核心逻辑，
 * findClass()将文件加载到内存成为，
 * defineClass()是将二进制文件转换为活的class文件，
 * 自定义类加载器也是从这三个核心方法入手的，
 * 我们通过重写findClass()方法来自定义了一个类加载器，成功加载了本地的一个class文件。
 * <p>
 * ClassCastException
 * <p>
 * 同一个类加载器下，一个类型只会初始化一次
 */
public class BreakHungryByClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String filePath = "/Users/laychv/Projects/github/StartDesignPattern/code/src/com/laychv/design/creational/SingletonPattern/SingletonHungry.class";

        String name = "SingletonHungry";
        BreakHungryClassLoader loader = new BreakHungryClassLoader();
        Class<SingletonHungry> singleton = (Class<SingletonHungry>) loader.loadClass(name);
        Constructor<SingletonHungry> constructor = singleton.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonHungry instance = constructor.newInstance();
        instance.doSome2();
    }
}
