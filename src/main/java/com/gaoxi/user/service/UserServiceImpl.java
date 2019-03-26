package com.gaoxi.user.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.common.entity.user.UserEntity;
import com.gaoxi.common.facade.user.UserService;
import com.gaoxi.common.req.User.LoginReq;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login() {
        System.out.println("-------" + "hello world" + "---------");
        UserEntity ue = new UserEntity();
        ue.setUsername("zhangsan");
        ue.setPhone("123456");
        return ue;
    }
}
