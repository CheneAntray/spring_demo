package com.acorus.spring6.iocxml.automatic.controller;

import com.acorus.spring6.iocxml.automatic.service.UserService;

/**
 * ClassName: UserController
 * Package: com.acorus.spring6.iocxml.automatic.controller
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/9 14:55
 * @Version 1.0
 */
public class UserController {

    //定义service的属性并生成set方法
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("UserController...");
        //调用service中的方法
        userService.addUserService();
    }
}
