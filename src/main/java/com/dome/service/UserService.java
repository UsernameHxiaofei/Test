package com.dome.service;

import com.dome.mapper.UserMapper;
import com.dome.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryUser() {
       return userMapper.queryUser();
    }
}
