package com.acorus.spring6.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ClassName: SpringTxConfig
 * Package: com.acorus.spring6.config
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/20 14:07
 * @Version 1.0
 */
@Configuration      //配置类
@ComponentScan("com.acorus.spring6")    //注解的包扫描路径
@EnableTransactionManagement    //开启声明式事物
public class SpringTxConfig {

    /**
     * 注入DataSource的对象
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://114.116.64.90:3306/spring?serverTimezone=UTC");
        dataSource.setUsername("acorus");
        dataSource.setPassword("acorus");
        return dataSource;
    }

    /**
     * 注入JdbcTemplate的对象
     * @param dataSource
     * @return
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }


    /**
     * 配置事物管理器
     * @param dataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //设置数据源对象
        transactionManager.setDataSource(dataSource);
        //将事物管理器返回
        return transactionManager;
    }
}
