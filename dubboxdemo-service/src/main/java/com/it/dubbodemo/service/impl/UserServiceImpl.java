package com.it.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.it.dubbodemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "hello";
    }
}
