package com.example.repair.domain;

import com.example.repair.util.SystemDate;

import java.time.LocalDate;

public class Appointment {

    private String name;
    private String surname;
    private String phoneNumber;
    private SystemDate date;
    private Time time;

    private DiagnosticCheck diagnosticCheck;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public SystemDate getDate() {
        return date;
    }

    public void setDate(SystemDate date) {
        this.date = date;
    }
}
