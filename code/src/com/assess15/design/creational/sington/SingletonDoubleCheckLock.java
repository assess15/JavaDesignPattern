package com.assess15.design.creational.sington;

/**
 * 双重校验锁-单例模式-线程安全
 * <p>
 * 通过同步锁: 时间换空间
 * 指令重排序问题: 通过volatile解决,缓存一致性
 * <p>
 * 线程 0
 * 1. 分配对象的内存空间
 * 3. 设置instance指向内存空间
 * 2. 初始化对象
 * 4. 线程0初次访问对象
 *
 */
public class SingletonDoubleCheckLock {

    // 使用volatile关键字防止重排序，因为 getSingleton()不是原子操作，可能创建一个不完整的实例
    private static volatile SingletonDoubleCheckLock singleton;

    private SingletonDoubleCheckLock() {
    }

    // 因为这里的同步只需在第一次创建实例时才同步，一旦创建成功，以后获取实例时就不需要同步获取锁了
    public static SingletonDoubleCheckLock getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheckLock();
                }
            }
        }
        return singleton;
    }

    public void doSome1() {
        System.out.println("双重校验锁!!!!");
    }
}
