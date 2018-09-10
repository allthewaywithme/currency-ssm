package com.currency.login.controller;

import com.currency.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/10 11:41
 */
@RequestMapping
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }



}
