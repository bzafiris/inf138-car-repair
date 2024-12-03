package com.example.repair.domain;


import com.example.repair.util.SystemDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppointmentTest {

    private Appointment appointment;

    @Before
    public void setUp() {

        appointment = new Appointment("Name", "Surname", "123456",
                SystemDate.now(), new Time(12, 0));
    }

    @Test
    public void shouldNotOverlap_withSameDateDiffHours() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now(), new Time(13, 0));

        Assert.assertFalse(appointment.overlapsWith(other));

    }

    @Test
    public void shouldNotOverlap_withDifferentDateSameHours() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now().addDays(1), new Time(12, 0));

        Assert.assertFalse(appointment.overlapsWith(other));

    }

    @Test
    public void shouldOverlap_withSameDateSameHours() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now(), new Time(12, 0));

        Assert.assertTrue(appointment.overlapsWith(other));

    }
}