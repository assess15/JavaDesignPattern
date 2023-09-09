package com.start.designpattern.test;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        testInteger();
//        testint();
        testReflect();
    }

    /**
     * false
     * true
     * 如果值的范围在-128到127之间，它就从高速缓存返回实例。
     * IntegerCache.java，它缓存了从-128到127之间的所有的整数对象。
     * 为什么这里需要缓存？
     * <p>
     * 合乎逻辑的理由是，在此范围内的“小”整数使用率比大整数要高，因此，使用相同的底层对象是有价值的，可以减少潜在的内存占用。
     */
    public static void testInteger() {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);
        Integer c = 100, d = 100;
        System.out.println(c == d);

        Integer e = 127, f = 127;
        System.out.println(e == f);
    }

    /**
     * true
     * true
     */
    public static void testint() {
        int a = 1000, b = 1000;
        System.out.println(a == b);
        int c = 100, d = 100;
        System.out.println(c == d);
    }

    /**
     *
     */
    public static void testReflect() throws NoSuchFieldException, IllegalAccessException {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field mcache = cache.getDeclaredField("cache");
        mcache.setAccessible(true);
        Integer[] ncache = (Integer[]) mcache.get(cache);
        ncache[132] = ncache[134];

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
