package com.example.repair.domain;

import static org.junit.jupiter.api.Assertions.*;

import com.example.repair.util.SystemDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {

    private Appointment appointment;

    @BeforeEach
    void setUp() {

        appointment = new Appointment("Name", "Surname", "123456",
                SystemDate.now(), new Time(12, 0));
    }

    @Test
    void sameDateDiffHours_shouldNotOverlap() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now(), new Time(13, 0));

        Assertions.assertFalse(appointment.overlapsWith(other));

    }

    @Test
    void differentDateSameHours_shouldNotOverlap() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now().addDays(1), new Time(12, 0));

        Assertions.assertFalse(appointment.overlapsWith(other));

    }

    @Test
    void sameDateSameHours_shouldOverlap() {

        Appointment other = new Appointment("Name2", "Surname2", "1234567",
                SystemDate.now(), new Time(12, 0));

        Assertions.assertTrue(appointment.overlapsWith(other));

    }
}