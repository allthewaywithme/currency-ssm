package com.currency.user.controller;

import com.currency.user.entity.User;
import com.currency.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/10 11:10
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/aa")
    public String toAa(){
        return "aa";
    }

    @RequestMapping
    public String tobb(){
        return "bb";
    }


    @RequestMapping("/get")
    @ResponseBody
    public User getUserById(){

        return userService.selectByPrimaryKey(1l);
    }
}
