package com.oop.composeition;

public class Car {

    private String model;
    private String color;
    private int doors;

    public Car() {
    }

    public Car(String model, String color, int doors) {
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
