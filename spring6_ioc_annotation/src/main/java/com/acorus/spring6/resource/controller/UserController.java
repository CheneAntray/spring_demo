package com.acorus.spring6.resource.controller;


import com.acorus.spring6.bean.User;
import com.acorus.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Package: com.acorus.spring6.iocxml.automatic.controller
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:55
 * @Version 1.0
 */
@Controller("myUserController")
public class UserController {

    @Resource   //首先根据指定名称（name），其次属性名称，再次属性类型
    private UserService userService;


    public void addUser(){
        System.out.println("UserController...");
        //调用service中的方法
        userService.addUserService();
    }
}
