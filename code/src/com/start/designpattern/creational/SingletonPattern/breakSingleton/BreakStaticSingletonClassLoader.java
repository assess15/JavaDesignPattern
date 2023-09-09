package com.start.designpattern.creational.SingletonPattern.breakSingleton;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * 自定义ClassLoader
 * 使用的是findClass方式，不是loadClass
 * 可能出现的问题
 * FileNotFoundException，先使用javac编译出class文件，使用绝对路径
 * NoClassDefFoundError，
 */
public class BreakStaticSingletonClassLoader extends ClassLoader {

    public BreakStaticSingletonClassLoader() {
    }

    public BreakStaticSingletonClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String filePath = "/Users/laychv/Projects/github/StartDesignPattern/code/src/com/laychv/design/creational/SingletonPattern/SingletonStaticInnerClass.class";
        File file = new File(filePath);

        try {
            byte[] bytes = getBytes(file);
            Class<?> clazz = this.defineClass(name, bytes, 0, bytes.length);
            return clazz;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    private byte[] getBytes(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer bb = ByteBuffer.allocate(1024);
        while (true) {
            int i = fc.read(bb);
            if (i == 0 || i == -1) {
                break;
            }
            bb.flip();
            wbc.write(bb);
            bb.clear();
        }
        fis.close();
        return baos.toByteArray();
    }
}
