package com.acorus.spring6.bean;

import com.acorus.spring6.config.SpringConfig;
import com.acorus.spring6.resource.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: TestConfiguration
 * Package: com.acorus.spring6.bean
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/12 14:30
 * @Version 1.0
 */
public class TestConfiguration {

    /**
     * 测试配置类
     */
    @Test
    public void testConfig(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取对象
        UserController userController = context.getBean(UserController.class);
        userController.addUser();
    }
}
