package com.example.repair.domain;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepairTaskTest {

    private RepairTask task;
    private PartType motorOil;
    private PartType oilFilter;

    @Before
    public void setUp() throws Exception {

        motorOil = new PartType("abc", "abc", 10, 10);
        oilFilter = new PartType("abc", "abcd", 20, 10);

        TaskType taskType = new TaskType("Αλλαγή λαδιών",
                "Αλλαγή λαδιών", 10);

        task = new RepairTask(taskType);

    }

    @Test
    public void getCost_whenNoPartUsages() {
        task.setTaskHours(10);
        Assert.assertEquals(100, task.getCost(), 0.0001);
    }

    @Test
    public void getCost_whenSinglePartUsages() {
        PartUsage partUsage = task.addPartUsage(motorOil, 2);
        task.setTaskHours(10);
        Assert.assertEquals(120, task.getCost(), 0.0001);
    }

    @Test
    public void getCost_whenMultiplePartUsages() {
        task.addPartUsage(motorOil, 2);
        task.addPartUsage(oilFilter, 1);
        task.setTaskHours(10);
        Assert.assertEquals(140, task.getCost(), 0.0001);
    }
}