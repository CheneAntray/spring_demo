package com.acorus.spring6.iocxml;

import com.acorus.spring6.iocxml.bean.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Package: com.acorus.spring6.iocxml
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 9:48
 * @Version 1.0
 */
public class TestUser {

    @Test
    public void testUserBean(){
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 1,根据id获取bean
        User user1 = (User) context.getBean("user");
        //对象使用
        System.out.println("根据id获取bean"+user1);

        // 2,根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("根据类型获取bean"+user2);
        // 3,根据id和类型
        User user3 = context.getBean("user", User.class);
        System.out.println("根据类型获取bean"+user3);


    }

    @Test
    public void testInterfaceBean(){
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据接口类型获取bean
        UserDao user1 = context.getBean(UserDao.class);
        user1.run();

    }
}
