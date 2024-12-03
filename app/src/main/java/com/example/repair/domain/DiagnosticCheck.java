package com.example.repair.domain;

import com.example.repair.util.SimpleCalendar;
import com.example.repair.util.SystemDate;

public class DiagnosticCheck {

    private Car car;
    private SimpleCalendar checkDate;
    private String description;
    private float estimatedCost;
    /**
     * Duration in days
     */
    private int estimatedRepairDuration;

    private Appointment appointment;

    public DiagnosticCheck(String description, float estimatedCost, int estimatedRepairDuration, Appointment appointment, Car car) {
        this.description = description;
        this.estimatedCost = estimatedCost;
        this.estimatedRepairDuration = estimatedRepairDuration;
        this.appointment = appointment;
        this.checkDate = SystemDate.now();
        this.car = car;
    }

    public SimpleCalendar getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(SimpleCalendar checkDate) {
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


    public Repair approveForRepair(float advancePaymentAmount, Customer customer){

        if (advancePaymentAmount < 0.1 * estimatedCost){
            return null;
        }

        if (customer == null){
            return null;
        }

        Repair repair = new Repair();
        repair.setCustomer(customer);
        repair.addAdvancePayment(advancePaymentAmount);
        repair.setDiagnosticCheck(this);

        return repair;
    }

}
