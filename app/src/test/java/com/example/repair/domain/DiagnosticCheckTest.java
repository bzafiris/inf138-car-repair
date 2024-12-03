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
    public void testAccessorMethods(){


        SimpleCalendar checkDate = new SimpleCalendar(2024, 1, 1);

        check.setCheckDate(checkDate);
        check.setAppointment(null);
        check.setDescription("Other description");
        check.setEstimatedCost(2000);
        check.setEstimatedRepairDuration(100);

        Assert.assertEquals(checkDate, check.getCheckDate());
        Assert.assertEquals(null, check.getAppointment());
        Assert.assertEquals("Other description", check.getDescription());

    }

    @Test
    public void shouldBeApproved_whenSufficientAdvancePayment() {
        Repair repair = check.approveForRepair(100, customer);
        Assert.assertNotNull(repair);
        Assert.assertNotNull(repair.getCustomer());
    }

    @Test
    public void shouldBeRejected_whenInsufficientAdvancePayment(){
        Repair repair = check.approveForRepair(99, customer);
        Assert.assertNull(repair);
    }

    @Test
    public void shouldBeRejected_whenCustomerIsNull(){
        Repair repair = check.approveForRepair(101, null);
        Assert.assertNull(repair);
    }

}