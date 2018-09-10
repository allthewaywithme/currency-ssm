package com.currency.user.service;

import com.currency.user.entity.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/10 11:10
 */
public interface UserService {

    User selectByPrimaryKey(Long id);
}
