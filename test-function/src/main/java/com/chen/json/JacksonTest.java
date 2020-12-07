package com.chen.json;

import com.chen.utils.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * author: JINCHENCHEN
 * date: 2020/12/07
 */
public class JacksonTest {
    public static void main(String[] args) throws JsonProcessingException {
        mapTest();
        objectTest();
    }
    public static void objectTest() throws JsonProcessingException {
        User user = new User(1L, "李明");
        ObjectMapper jsonMapper = new ObjectMapper();
        String userJson = jsonMapper.writeValueAsString(user);
        System.out.println("userJson = " + userJson);
        User userFromJson = jsonMapper.readValue(userJson, User.class);
        System.out.println("userFromJson = " + userFromJson);
    }

    public static void mapTest() throws JsonProcessingException {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("1", "test1");
        map.put("2", "test2");
        map.put("12", "test12");
        ObjectMapper mapper = new ObjectMapper();
        String mapJson = mapper.writeValueAsString(map);
        System.out.println("mapJson = " + mapJson);
        Map<String, String> mapFromJson = mapper.readValue(mapJson, new TypeReference<Map<String, String>>() {
        });
        System.out.println("mapFromJson.toString() = " + mapFromJson);
    }
}
