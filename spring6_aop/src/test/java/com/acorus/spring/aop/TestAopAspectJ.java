package com.acorus.spring.aop;

import com.acorus.spring.aop.config.AopConfig;
import com.acorus.spring.aop.proxy.Calculator;
import com.acorus.spring.aop.proxy.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: TestAopAspectJ
 * Package: com.acorus.spring.aop
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/14 13:53
 * @Version 1.0
 */
public class TestAopAspectJ {

    /**
     * 测试aop通知
     */
    @Test
    public void testAopAspectJ(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        //获取代理对象
        Calculator calculator = (Calculator) context.getBean( "calculatorImpl");
        calculator.add(1,2);
    }
}
