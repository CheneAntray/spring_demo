package com.acorus.spring6.iocxml;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestJdbc
 * Package: com.acorus.spring6.iocxml
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 10:14
 * @Version 1.0
 */
public class TestJdbc {

    /**
     * 测试原生数据源配置
     */
    @Test
    public void testNativeJdbc(){
        //创建连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        //设置参数
        dataSource.setUrl("jdbc:mysql://114.116.64.90:3306/acorus?serverTimezone=UTC");
        dataSource.setUsername("acorus");
        dataSource.setPassword("acorus");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

    }

    /**
     * 测试配置文件注入数据源信息
     */
    @Test
    public void testJdbc(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_jdbc.xml");
        //获取对象
        DruidDataSource dataSource = (DruidDataSource) context.getBean("druidDataSource");
        System.out.println(dataSource.getUrl());
    }
}
