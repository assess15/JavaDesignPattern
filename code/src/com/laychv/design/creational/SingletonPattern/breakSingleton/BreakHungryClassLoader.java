package com.laychv.design.creational.SingletonPattern.breakSingleton;

import java.io.*;

public class BreakHungryClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String filePath = "/Users/laychv/Projects/github/StartDesignPattern/code/src/com/laychv/design/creational/SingletonPattern/SingletonHungry.class";

        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            bis = new BufferedInputStream(fis);
            baos = new ByteArrayOutputStream();
            int length = 0;
            byte[] data = new byte[1024];
            while ((length = bis.read(data)) != -1) {
                baos.write(data, 0, length);
            }
            byte[] bytes = baos.toByteArray();
            Class<?> clazz = defineClass(null, bytes, 0, bytes.length);
            return clazz;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        return super.findClass(name);
    }
}
