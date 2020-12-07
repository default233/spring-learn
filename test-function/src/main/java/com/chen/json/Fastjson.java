package com.chen.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.chen.utils.User;

import java.util.HashMap;
import java.util.Map;

/**
 * author: JINCHENCHEN
 * date: 2020/12/07
 */
public class Fastjson {
    public static void main(String[] args) {
        mapTest();
    }
    public static void objectTest() {
        User user = new User(2L, "陈明");
        String userJson = JSON.toJSONString(user);
        System.out.println("userJson = " + userJson);
        User userFromJson = JSON.parseObject(userJson, User.class);
        System.out.println("userFromJson = " + userFromJson);
    }

    public static void mapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "s1");
        map.put("2", "s2");
        map.put("12", "s12");
        String mapJson = JSON.toJSONString(map);
        System.out.println("mapJson = " + mapJson);
        Map<String, String> mapFromJson = JSON.parseObject(mapJson, Map.class);
        System.out.println("mapFromJson.toString() = " + mapFromJson);
    }
}
