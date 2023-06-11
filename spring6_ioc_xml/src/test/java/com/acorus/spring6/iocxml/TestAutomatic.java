package com.acorus.spring6.iocxml;

import com.acorus.spring6.iocxml.automatic.controller.UserController;
import com.acorus.spring6.iocxml.automatic.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestAutomatic
 * Package: com.acorus.spring6.iocxml
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/11 21:06
 * @Version 1.0
 */
public class TestAutomatic {

    /**
     * 测试基于xml方式自动装配
     */
    @Test
    public void testAutomatic(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_automatic.xml");
        //获取controller对象
        UserController userController = (UserController) context.getBean("userController");
        userController.addUser();
    }
}
