package com.chen.pojo;

import java.util.Date;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/09
 */
public class ProCar {
    private Long carId;
    private String carName;
    private String description;
    private Date createTime;

    public ProCar() {
    }

    public ProCar(Long carId, String carName, String description, Date createTime) {
        this.carId = carId;
        this.carName = carName;
        this.description = description;
        this.createTime = createTime;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProCar{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
