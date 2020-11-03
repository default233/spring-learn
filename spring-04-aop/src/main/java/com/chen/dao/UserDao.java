package com.chen.dao;

import com.chen.pojo.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/02
 */
@Repository
public class UserDao {

    @Resource
    private User testUser;

    public User selectUserById(Long userId) {
        return testUser;
    }
}
