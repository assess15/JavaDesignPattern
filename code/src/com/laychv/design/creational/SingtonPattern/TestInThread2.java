package com.laychv.design.creational.SingtonPattern;

public class TestInThread2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new TestThread();
        }

        for (Thread thread : threads) {
            thread.start();
        }

//        Thread t1 = new Thread(new TestThread());
//        Thread t2 = new Thread(new TestThread());
//        t1.start();
//        t2.start();
//        System.out.println("end");
    }

    /**
     * 经过测试,偶现不同,测试发现不安全
     */
    private static void test1() {
        SingletonCollect.setInstance("key", new Object());
        Object instance = SingletonCollect.getInstance("key");
        int key = SingletonCollect.getInstance("key").hashCode();
        System.out.println(Thread.currentThread().getName() + "  instance = " + instance + " key = " + key);
    }

    private static void test2() {
        SingletonThreadLocal instance = SingletonThreadLocal.getInstance();
        int i = instance.hashCode();
        System.out.println(Thread.currentThread().getName() + " instance = " + instance + "hashCode =" + i);
    }

    static class TestThread extends Thread {
        @Override
        public void run() {
//            test1();
            test2();
        }
    }
}
