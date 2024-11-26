package com.example.repair.domain;

import com.example.repair.util.SystemDate;

public class DiagnosticCheck {

    private SystemDate checkDate;
    private String description;
    private float estimatedCost;
    /**
     * Duration in days
     */
    private int estimatedRepairDuration;

    private Appointment appointment;

    public SystemDate getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(SystemDate checkDate) {
        this.checkDate = checkDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(float estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public int getEstimatedRepairDuration() {
        return estimatedRepairDuration;
    }

    public void setEstimatedRepairDuration(int estimatedRepairDuration) {
        this.estimatedRepairDuration = estimatedRepairDuration;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
