package com.acorus.spring6.bean;

import com.acorus.spring6.autowired.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Test
 * Package: com.acorus.spring6.annotation
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/12 9:44
 * @Version 1.0
 */
public class TestUser {

    /**
     * 测试@Component 注解
     */
    @Test
    public void testUser(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        User user = context.getBean(User.class);
        System.out.println(user);

    }

    /**
     * 测试@Autowired 自动注入
     */
    @Test
    public void testUserAutowired(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        UserController controller = context.getBean(UserController.class);
        controller.addUser();
    }

    /**
     * 测试@Resource 自动注入
     */
    @Test
    public void testUserResource(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        com.acorus.spring6.resource.controller.UserController userController = context.getBean(com.acorus.spring6.resource.controller.UserController.class);
        userController.addUser();
    }
}
