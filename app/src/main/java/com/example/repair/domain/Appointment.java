package com.example.repair.domain;

import com.example.repair.util.SimpleCalendar;
import com.example.repair.util.SystemDate;

import java.time.LocalDate;

public class Appointment {

    private String name;
    private String surname;
    private String phoneNumber;
    private SimpleCalendar date;
    private Time time;

    public Appointment(String name, String surname, String phoneNumber, SimpleCalendar date, Time time) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
    }

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

    public SimpleCalendar getDate() {
        return date;
    }

    public void setDate(SimpleCalendar date) {
        this.date = date;
    }

    /**
     * Ελέγχει αν το τρεχον ραντεβού επικαλύπτεται χρονικά με το other
     *
     * @param other
     * @return
     */
    public boolean overlapsWith(Appointment other) {

        if (!other.date.equals(this.date)) {
            return false;
        }

        if (time.hours != other.time.hours) {
            return false;
        }

        return true;
    }


}
