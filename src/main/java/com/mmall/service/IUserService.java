package com.mmall.service;

import com.mmall.common.ServiceResponse;
import com.mmall.pojo.User;

/**
 * Created by kjs on 2019/4/6
 */
public interface IUserService {

    ServiceResponse<User> login(String username, String password);
}
