package com.example.repair.domain;

import com.example.repair.util.SystemDate;

public class Car {

    private String plateNumber;
    private SystemDate registrationDate;
    private String brand;
    private String model;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public SystemDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(SystemDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
