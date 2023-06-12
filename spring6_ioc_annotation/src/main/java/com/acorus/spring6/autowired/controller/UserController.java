package com.acorus.spring6.autowired.controller;


import com.acorus.spring6.autowired.service.UserService;
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
@Controller
public class UserController {

    //第一种方式，属性注入
//    @Autowired
//    private UserService userService;

    //第二种方式，set方法上加注解
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    //第三种方式，构造方法上加注解
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //第四种方式，形参上注入
//    private UserService userService;
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

    //第五种方式，只有一个有参构造可以不加注解
//    private UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //第六种方式，@Autowired 和 @ Qualifire 一起使用，后者指定名字
    @Autowired
    @Qualifier(value = "userServiceImpl")
    private UserService userService;
    public void addUser(){
        System.out.println("UserController...");
        //调用service中的方法
        userService.addUserService();
    }
}
