package com.example.repair.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repair {

    private boolean completed = false;
    private Customer customer;

    private Engineer supervisor;

    private Set<Payment> payments = new HashSet<>();

    private DiagnosticCheck diagnosticCheck;

    private List<RepairTask> repairTasks = new ArrayList<>();

    public float getTotalCost(){
        float totalCost = 0;

        for(RepairTask task: repairTasks){
            totalCost += task.getCost();
        }
        return totalCost;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void addAdvancePayment(float downPaymentAmount) {
        // TODO: check for duplicate downpayments
        this.payments.add(new Payment(downPaymentAmount, PaymentType.ADVANCE_PAYMENT));
    }

    public boolean isFullPaid(){
        float totalPayments = 0;
        for(Payment p: payments){
            totalPayments += p.getAmount();
        }

        if (totalPayments == getTotalCost()){
            return true;
        }
        return false;
    }

    public RepairTask assignTask(Engineer engineer, TaskType taskType){
        if (engineer == null || taskType == null){
            return null;
        }
        RepairTask task = new RepairTask(taskType);
        task.setEngineer(engineer);
        repairTasks.add(task);

        return task;
    }

    public DiagnosticCheck getDiagnosticCheck() {
        return diagnosticCheck;
    }

    public void setDiagnosticCheck(DiagnosticCheck diagnosticCheck) {
        this.diagnosticCheck = diagnosticCheck;
    }

    public void setSupervisor(Engineer supervisor) {
        this.supervisor = supervisor;
    }

    public Engineer getSupervisor() {
        return supervisor;
    }
}
