package com.example.repair.domain;

import com.example.repair.util.SimpleCalendar;

public class Car {

    private String plateNumber;
    private SimpleCalendar registrationDate;
    private String brand;
    private String model;

    public Car(String plateNumber, SimpleCalendar registrationDate, String brand, String model) {
        this.plateNumber = plateNumber;
        this.registrationDate = registrationDate;
        this.brand = brand;
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public SimpleCalendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(SimpleCalendar registrationDate) {
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
