package com.laychv.design.creational.SingletonPattern.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class MyClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader();
//        Class clazz = myClassLoader.loadClass(args[0]);
        Class clazz = myClassLoader.loadClass("Hello");

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(null, null);
    }

    /**
     * 重写父类方法，返回一个Class对象
     * ClassLoader中对于这个方法的注释是:
     * This method should be overridden by class loader implementations
     */
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        String classFilename = "/Users/laychv/Projects/github/StartDesignPattern/code/src/com/laychv/design/creational/SingletonPattern/classloader/Hello.class";
//        String classFilename = name + ".class";
        File classFile = new File(classFilename);
        if (classFile.exists()) {
            try (FileChannel fileChannel = new FileInputStream(classFile).getChannel()) {
                MappedByteBuffer mappedByteBuffer = fileChannel.map(MapMode.READ_ONLY, 0, fileChannel.size());
                byte[] b = mappedByteBuffer.array();
                clazz = defineClass(name, b, 0, b.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (clazz == null) {
            throw new ClassNotFoundException(name);
        }
        return clazz;
    }
}
