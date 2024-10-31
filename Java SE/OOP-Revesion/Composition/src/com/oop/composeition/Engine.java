package com.oop.composeition;

public class Engine {
    private String type;
    private String power;


    public Engine() {
    }

    public Engine(String type, String power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
