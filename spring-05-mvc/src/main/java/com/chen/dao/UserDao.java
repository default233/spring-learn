package com.chen.dao;

import com.chen.pojo.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
@Repository("userDao")
public class UserDao {

    @Resource
    private User user;

    public UserDao() {
    }

    public User selectUserById(Long userId) {
        return user;
    }
}
