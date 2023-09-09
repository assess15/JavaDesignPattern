package com.start.designpattern.structural.ProxyPattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理:
 * 不需要实现接口,但是需要指定接口类型
 */
public class ProxyFactory {
    // 维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**  给目标对象生成代理对象 **/
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务!!!!!!!");
                        Object invoke = method.invoke(target, args);
                        System.out.println("提交事务!!!!!!!");
                        return invoke;
                    }
                });
    }
}
