package com.chen.springboot02start.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Bean;

/**
 * author: JINCHENCHEN
 * date: 2020/12/23
 */
@ConfigurationProperties(prefix = "random-num")
public class Random {
    private int intNum;
    private String valueNum;
    private long longNum;
    private String uuid;

    public Random() {
    }

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    public String getValueNum() {
        return valueNum;
    }

    public void setValueNum(String valueNum) {
        this.valueNum = valueNum;
    }

    public long getLongNum() {
        return longNum;
    }

    public void setLongNum(long longNum) {
        this.longNum = longNum;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Random{" +
                "intNum=" + intNum +
                ", valueNum='" + valueNum + '\'' +
                ", longNum=" + longNum +
                ", uuid='" + uuid + '\'' +
                '}';
    }

    public Random(int intNum, String valueNum, long longNum, String uuid) {
        this.intNum = intNum;
        this.valueNum = valueNum;
        this.longNum = longNum;
        this.uuid = uuid;
    }
}
