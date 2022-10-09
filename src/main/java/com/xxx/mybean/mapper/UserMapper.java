package com.xxx.mybean.mapper;

import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {
    public boolean selectByUserId(String username,String password){
        System.out.println("tijiao");
        System.out.println("dao");
        return true;
    }
}
