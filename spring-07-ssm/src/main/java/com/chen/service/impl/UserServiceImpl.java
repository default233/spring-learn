package com.chen.service.impl;

import com.chen.mapper.UserMapper;
import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: JINCHENCHEN
 * date: 2020/11/26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
