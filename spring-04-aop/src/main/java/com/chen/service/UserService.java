package com.chen.service;

import com.chen.dao.UserDao;
import com.chen.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/02
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User selectUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
}
