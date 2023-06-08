package com.acorus.spring6.iocxml;

import com.acorus.spring6.iocxml.bean.UserDao;
import com.acorus.spring6.iocxml.di.Book;
import com.acorus.spring6.iocxml.diobj.Department;
import com.acorus.spring6.iocxml.diobj.EmpLoyee;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import org.springframework.context.ApplicationContext;
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


    /**
     * 测试加载bean的不同方式
     */
    @Test
    public void testUserBean(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
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

    /**
     * 测试多实现下不可通过接口类型获取bean
     */
    @Test
    public void testInterfaceBean(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据接口类型获取bean
        UserDao user1 = context.getBean(UserDao.class);
        user1.run();

    }

    /**
     * 测试不同的注入方式
     */
    @Test
    public void testDi(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_di.xml");
        //setter注入
        Book book = (Book) context.getBean("book");
        System.out.println(book);

        //构造器注入
        Book bookCon = (Book) context.getBean("bookCon");
        System.out.println(bookCon);


    }

    /**
     * 对象类型属性注入
     *      1，引用外部bean
     *      2，内部bean
     *      3，级联属性赋值
     */
    @Test
    public void testDiObj(){
        //加载配置 文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_diobj.xml");
        //引用外部bean
        EmpLoyee employee = (EmpLoyee) context.getBean("employee");
        System.out.println(employee);

        //内部bean
        EmpLoyee employee1 = (EmpLoyee) context.getBean("employee1");
        System.out.println(employee1);

        //级联赋值
        EmpLoyee employee3 = (EmpLoyee) context.getBean("employee2");
        System.out.println(employee3);
    }

    /**
     * 测试数组注入
     */
    @Test
    public void testArray(){
        //加载xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_diarray.xml");
        //获取对象
        EmpLoyee empLoyee = (EmpLoyee) context.getBean("employee");
        System.out.println(empLoyee);

    }

    /**
     * 测试集合注入
     */
    @Test
    public void testList(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_dilist.xml");
        //获取对象
        Department department = (Department) context.getBean("department");
        System.out.println(department);
    }


}
