package com.laychv.design.creational.SingletonPattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 不使用synchronized和lock，如何实现一个线程安全的单例?
 * 所有方式中，只要是线程安全的，其实都直接或者间接用到了synchronized，
 * 间接用到是什么意思呢，就比如饿汉式、静态内部类、枚举，
 * 其实现原理都是利用借助了类加载的时候初始化单例，即借助了ClassLoader的线程安全机制。
 * <p>
 * 所谓ClassLoader的线程安全机制，
 * 就是ClassLoader的loadClass方法在加载类的时候使用了synchronized关键字。
 * 也正是因为这样， 除非被重写，这个方法默认在整个装载过程中都是同步的，也就是保证了线程安全。
 * <p>
 * 那么答案是什么呢，就是利用CAS乐观锁，他虽然名字中有个锁字，
 * 但其实是无锁化技术，当多个线程尝试使用CAS同时更新同一个变量时，
 * 只有其中一个线程能更新变量的值，而其它线程都失败，失败的线程并不会被挂起，而是被告知这次竞争中失败，并可以再次尝试
 * <p>
 * 在JDK1.5中新增的JUC包就是建立在CAS之上的，相对于对于synchronized这种阻塞算法，
 * CAS是非阻塞算法的一种常见实现，他是一种基于忙等待的算法，依赖底层硬件的实现，
 * 相对于锁它没有线程切换和阻塞的额外消耗，可以支持较大的并行度。虽然CAS没有用到锁，
 * 但是他在不停的自旋，会对CPU造成较大的执行开销，在生产中我们不建议使用，
 * <p>
 * http://www.xiaojieboshi.com/pattern/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.html#%E5%BD%A9%E8%9B%8B
 */
public class CASSingleton {
    private static final AtomicReference<CASSingleton> instance = new AtomicReference<>();

    private CASSingleton() {
    }

    public static CASSingleton getInstance() {
        for (; ; ) {
            CASSingleton singleton = instance.get();
            if (singleton != null) {
                return singleton;
            }
            singleton = new CASSingleton();
            if (instance.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }

    public void show() {
        System.out.println("Singleton from: CAS");
    }
}
