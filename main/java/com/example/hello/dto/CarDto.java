package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {

    private String name;
    @JsonProperty("car_number") //json 형태는 car_number로 받겠다
    private String carNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
