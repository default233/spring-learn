package com.chen.service;

import com.chen.dao.UserDao;
import com.chen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
@Service("userService")
public class UserService {
    @Resource
    private UserDao userDao;

    public User selectUser(Long userId) {
        return userDao.selectUserById(userId);
    }
}
