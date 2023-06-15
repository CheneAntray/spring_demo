package com.acorus.spring.aop.proxy;

import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorStaticProxy
 * Package: com.acorus.spring.aop.proxy
 * Description: 静态代理demo
 *
 * @Author Acorus
 * @Create 2023/6/14 11:31
 * @Version 1.0
 */
//实现被代理对象的接口，保证有相同的功能
@Component
public class CalculatorStaticProxy implements Calculator {

    //将被代理的对象声明为成员变量
    private Calculator calculator;
    //通过构造器初始化

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    //做被代理对象方法的增强
    @Override
    public int add(int i, int j) {

        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
        // 通过目标对象来实现核心业务逻辑
        int addResult = calculator.add(i, j);
        System.out.println("[日志] add 方法结束了，结果是：" + addResult);
        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
