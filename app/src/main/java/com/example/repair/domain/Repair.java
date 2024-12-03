package com.example.repair.domain;

import java.util.HashSet;
import java.util.Set;

public class Repair {

    private boolean completed = false;
    private Customer customer;

    private Set<Payment> payments = new HashSet<>();

    private DiagnosticCheck diagnosticCheck;

    public float getTotalCost(){
        return -1;
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



    public DiagnosticCheck getDiagnosticCheck() {
        return diagnosticCheck;
    }

    public void setDiagnosticCheck(DiagnosticCheck diagnosticCheck) {
        this.diagnosticCheck = diagnosticCheck;
    }
}
