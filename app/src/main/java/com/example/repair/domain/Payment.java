package com.example.repair.domain;

import com.example.repair.util.SimpleCalendar;
import com.example.repair.util.SystemDate;

public class Payment {

    private float amount;
    private SimpleCalendar date;
    private PaymentType type;

    public Payment(float amount, PaymentType type) {
        this.amount = amount;
        this.type = type;
        this.date = SystemDate.now();
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public SimpleCalendar getDate() {
        return date;
    }

    public void setDate(SimpleCalendar date) {
        this.date = date;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }
}
