package com.example.repair.domain;

import java.util.ArrayList;
import java.util.List;

public class RepairTask {

    private final TaskType taskType;

    private int taskHours;
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

    public int getTaskHours() {
        return taskHours;
    }

    public void setTaskHours(int taskHours) {
        this.taskHours = taskHours;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public float getCost(){
        float totalCost = 0;
        float laborCost = taskHours * taskType.getCostPerHour();
        float partsCost = 0;

        for(PartUsage usage: partUsageList){
            partsCost += usage.getCost();
        }

        totalCost = partsCost + laborCost;

        return totalCost;
    }

    public PartUsage addPartUsage(PartType partType, int quantity) {
        PartUsage partUsage = new PartUsage(partType);
        partUsage.setQuantity(quantity);
        partUsageList.add(partUsage);
        return partUsage;
    }
}
