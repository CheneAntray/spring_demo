package com.acorus.spring.aop;

import com.acorus.spring.aop.config.AopConfig;
import com.acorus.spring.aop.proxy.Calculator;
import com.acorus.spring.aop.proxy.CalculatorImpl;
import com.acorus.spring.aop.proxy.CalculatorStaticProxy;
import com.acorus.spring.aop.proxy.DynamicProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: TestProxy
 * Package: com.acorus.spring.aop
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/14 11:40
 * @Version 1.0
 */
public class TestProxy {

    /**
     * 测试静态代理
     */
    @Test
    public void testStaticProxy(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        //获取对象
        Calculator calculator = context.getBean(CalculatorStaticProxy.class);
        calculator.add(1,2);
    }

    /**
     * 测试动态代理
     */
    @Test
    public void testDynamicProxy(){
        //创建动态代理对象工厂
        DynamicProxy dynamicProxy = new DynamicProxy(new CalculatorImpl());
        //通过工厂获取代理对象
        Calculator proxy = (Calculator) dynamicProxy.getProxy();
        //通过代理对象实现功能
        proxy.add(1,2);
    }
}
