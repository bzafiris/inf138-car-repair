package com.example.repair.domain;

public class TaskType {

    private final String name;
    private final String description;
    private final float costPerHour;

    public TaskType(String name, String description, float costPerHour) {
        this.name = name;
        this.description = description;
        this.costPerHour = costPerHour;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getCostPerHour() {
        return costPerHour;
    }

}
