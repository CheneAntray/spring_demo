package com.acorus.spring.aop.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ClassName: DynamicProxy
 * Package: com.acorus.spring.aop.proxy
 * Description:动态代理 动态返回代理对象
 *
 * @Author Acorus
 * @Create 2023/6/14 11:47
 * @Version 1.0
 */
public class DynamicProxy {

    //声明被代理对象的成员变量
    private Object target;
    //有参构造器初始化

    public DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 代理方法返回动态代理对象
     * @return
     */
    public Object getProxy(){
        /**
         * newProxyInstance()：创建一个代理实例
         * 其中有三个参数：
         * 1、classLoader：加载动态生成的代理类的类加载器
         * 2、interfaces：目标对象实现的所有接口的class对象所组成的数组
         * 3、invocationHandler：设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法
         */
        //获取类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //获得所有接口
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //匿名函数实现处理类
        InvocationHandler handler = new InvocationHandler(){

            /**
             * proxy：代理对象
             * method：代理对象需要实现的方法，即其中需要重写的方法
             * args：method所对应方法的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[动态代理][日志] "+method.getName()+"，异常："+e.getMessage());
                } finally {
                    System.out.println("[动态代理][日志] "+method.getName()+"，方法执行完毕");
                }
                return result;
            }

        };

        return Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
