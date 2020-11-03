package com.chen.config;

import com.chen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/02
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.chen")
public class AppConfig {

    @Bean("testUser")
    public User getUser() {
        User user = new User(002L, "李明");
        return user;
    }

}
