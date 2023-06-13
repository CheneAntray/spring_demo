package com.acorus.core;

/**
 * ClassName: ApplicationContext
 * Package: com.acorus.core
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 16:01
 * @Version 1.0
 */
public interface ApplicationContext {

    //获取对象方法
    Object getBean(Class clazz);
}
