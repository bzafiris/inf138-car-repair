package com.example.repair.domain;

import java.util.ArrayList;
import java.util.List;

public class RepairTask {

    private final TaskType taskType;

    private Engineer engineer;

    private List<PartUsage> partUsageList = new ArrayList<>();



    public RepairTask(TaskType taskType) {
        this.taskType = taskType;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public Engineer getEngineer() {
        return engineer;
    }
}
