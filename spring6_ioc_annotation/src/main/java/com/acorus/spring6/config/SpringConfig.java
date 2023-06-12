package com.acorus.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SpringConfig
 * Package: com.acorus.spring6.config
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/12 14:28
 * @Version 1.0
 */
@Configuration  //配置类
@ComponentScan("com.acorus.spring6")    //开启组件扫描
public class SpringConfig {
}
