package com.acorus.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: AopConfig
 * Package: com.acorus.spring.aop.config
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/14 11:39
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.acorus.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
