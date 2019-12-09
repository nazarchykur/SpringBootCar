package com.example.demo;

public class Car {

    // ==fields ==
    private String name;
    private String model;

    public Car() {
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
