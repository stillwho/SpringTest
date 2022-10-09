package com.xxx.mybean.service;

import com.xxx.mybean.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper = new UserMapper();
    public boolean login(String username,String password){
        userMapper.selectByUserId(username,password);
        return true;
    }
}
