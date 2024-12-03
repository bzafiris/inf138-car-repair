package com.example.repair.domain;

public class PartType {

    private final String model;
    private final String maker;
    private final float cost;
    private int stock;

    public PartType(String model, String maker, float cost, int stock) {
        this.model = model;
        this.maker = maker;
        this.cost = cost;
        this.stock = stock;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public float getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
