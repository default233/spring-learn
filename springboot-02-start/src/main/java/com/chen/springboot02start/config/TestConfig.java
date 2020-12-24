package com.chen.springboot02start.config;

import com.chen.springboot02start.pojo.Random;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * author: JINCHENCHEN
 * date: 2020/12/23
 */
@EnableConfigurationProperties(Random.class)
@Configuration
public class TestConfig {
}
