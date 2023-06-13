package com.acorus.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: CreateBean
 * Package: com.acorus.annotation
 * Description:
 *
 * @Author Acorus
 * @Create 2023/6/13 13:18
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateBean {
}
