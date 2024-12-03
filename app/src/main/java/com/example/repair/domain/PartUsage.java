package com.example.repair.domain;

public class PartUsage {

    private final PartType partType;

    private int quantity;

    public PartUsage(PartType partType) {
        this.partType = partType;
    }

    public PartType getPartType() {
        return partType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getCost(){
        return quantity * partType.getCost();
    }
}
