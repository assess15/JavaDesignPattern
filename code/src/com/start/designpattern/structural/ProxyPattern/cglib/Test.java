package com.start.designpattern.structural.ProxyPattern.cglib;

/**
 * @link https://segmentfault.com/a/1190000009235245
 * <p>
 * 上面的静态代理和动态代理模式都是要求目标对象实现一个接口或者多个接口,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,
 * 这个时候就可以使用构建目标对象子类的方式实现代理,这种方法就叫做:Cglib代理
 * Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.
 * Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用,
 * 例如Spring AOP和synaop,为他们提供方法的interception(拦截)
 * Cglib包的底层是通过使用字节码处理框架ASM来转换字节码并生成新的子类.
 * 代理的类不能为final,否则报错；目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
 * <p>
 * 注入: 同时导入cglib.jar和asm.jar
 */
public class Test {
    public static void main(String[] args) {
        // 1. 目标对象
        UserDao target = new UserDao();
        // 2. 代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        // 3. 执行代理对象的方法
        proxy.save();
    }
}