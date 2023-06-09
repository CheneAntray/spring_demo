package com.acorus.spring6.iocxml;

import com.acorus.spring6.iocxml.lifecycle.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestFactoryBean
 * Package: com.acorus.spring6.iocxml
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:42
 * @Version 1.0
 */
public class TestFactoryBean {

    /**
     * 测试factorybean
     */
    @Test
    public void testFactoryBean(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_factorybean.xml");
        //获取对象
        User user = (User) context.getBean("user");
        System.out.println(user);

    }
}
