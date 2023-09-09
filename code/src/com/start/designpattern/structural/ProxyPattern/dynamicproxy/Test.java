package com.start.designpattern.structural.ProxyPattern.dynamicproxy;

/**
 * 动态代理
 * 测试类
 * <p>
 * 在运行期，通过反射机制创建一个实现了一组给定接口的新类
 * 在运行时生成的class，必须提供一组interface给它，然后该class就宣称它实现了这些 interface。
 * 该class的实 例可以当作这些interface中的任何一个来用。但是这个Dynamic Proxy其实就是一个Proxy，
 * 它不会替你作实质性的工作，在生成它的实例时你必须提供一个handler，由它接管实际的工 作。
 * 动态代理也叫做:JDK代理,接口代理  接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理（InvocationHandler.invoke）。
 * 这样，在接口方法数量比较多的时候，我们可以进行灵活处理，
 * 而不需要像静态代理那样每一个方法进行中转。而且动态代理的应用使我们的类职责更加单一，复用性更强
 * <p>
 * JDK中生成代理对象的API
 * 代理类所在包:java.lang.reflect.Proxy
 * DK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,
 * 完整的写法是:  static Object newProxyInstance(ClassLoader loader, Class [] interfaces, InvocationHandler handler)
 * 注意该方法是在Proxy类中是静态方法,且接收的三个参数依次为:  ClassLoader loader:指定当前目标对象使用类加载器,用null表示默认类加载器
 * Class [] interfaces:需要实现的接口数组
 * InvocationHandler handler:调用处理器,执行目标对象的方法时,会触发调用处理器的方法,从而把当前执行目标对象的方法作为参数传入
 * java.lang.reflect.InvocationHandler：这是调用处理器接口，它自定义了一个 invoke 方法，用于集中处理在动态代理类对象上的方法调用，通常在该方法中实现对委托类的代理访问。
 * // 该方法负责集中处理动态代理类上的所有方法调用。第一个参数既是代理类实例，第二个参数是被调用的方法对象
 * // 第三个方法是调用参数。 Object invoke(Object proxy, Method method, Object[] args)
 */
public class Test {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        // 给目标对象,创建代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        // 执行方法(代理对象)
        proxy.save();

        System.out.println("------------");

        OrderDao order = new OrderDao();
        IOrderDao dao = (IOrderDao) new ProxyFactory(order).getProxyInstance();
        dao.save();
    }
}
