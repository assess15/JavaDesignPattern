package com.laychv.design.creational.SingletonPattern;

/**
 * 测试多线程中 单例模式
 * 通过hashCode看出
 */
public class TestInThread {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

    private static void test1() {
//        SingletonHungry singleton = SingletonHungry.getSingleton();
//        singleton.doSome2();
        int hashCode = SingletonHungry.getSingleton().hashCode();
        System.out.println(hashCode);
    }

    private static void test2() {
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.doSome();
        int i = SingletonEnum.getInstance().hashCode();
        System.out.println(i);
    }

    private static void test3() {
//        SingletonLazyUnsafe singleton = SingletonLazyUnsafe.getSingleton();
//        singleton.doSome4();
        int i = SingletonLazyUnsafe.getSingleton().hashCode();
        System.out.println(i);
    }

    private static void test4() {
        int i = SingletonLazySafe.getSingleton().hashCode();
        System.out.println(i);
    }

    private static void test5() {
        int i = SingletonDoubleCheckLock.getSingleton().hashCode();
        System.out.println(i);
    }

    private static void test6() {
        int i = SingletonHungry2.getInstance().hashCode();
        System.out.println(i);
    }

    private static void test7() {
        int i = SingletonLazySafe2.getInstance().hashCode();
        System.out.println(i);
    }

    private static void test8() {
        int i = SingletonStaticInnerClass.getInstance().hashCode();
        System.out.println(i);
    }

    private static void test9() {
        SingletonCollect.setInstance("key", SingletonCollect.class);
        SingletonCollect.getInstance("key");
    }

    private static void testCasSingleton() {
        CASSingleton.getInstance().show();
    }

    static class TestThread extends Thread {
        @Override
        public void run() {
//            test1();
//            test6();
//            test7();
//            test2();
//            test3();
//            test4();
//            test5();
//            test8();
//            test9();
            testCasSingleton();
        }
    }
}
