package com.xxx.mybean;

import com.xxx.mybean.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext cxt= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper)cxt.getBean("userMapper");
        userMapper.selectByUserId("123","234");
    }
}
