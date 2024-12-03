package com.example.repair.domain;


import com.example.repair.util.SimpleCalendar;
import com.example.repair.util.SystemDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DiagnosticCheckTest {


    DiagnosticCheck check;
    private Customer customer;

    @Before
    public void setup(){

        Car car = new Car("AB 1223", new SimpleCalendar(2000, 01, 01),
                "Opel", "Corsa");
        Appointment appointment = new Appointment("John", "Doe",
                "2108203100", SystemDate.now(), new Time(12, 0));
        check = new DiagnosticCheck("Broken engine",
                1000, 10, appointment, car);

        customer = new Customer();

    }

    @Test
    public void shouldBeApproved_whenSufficientAdvancePayment() {
        Repair repair = check.approveForRepair(100, customer);
        Assert.assertNotNull(repair);
        Assert.assertNotNull(repair.getCustomer());
    }

    public void shouldBeRejected_whenInsufficientAdvancePayment(){

    }
}