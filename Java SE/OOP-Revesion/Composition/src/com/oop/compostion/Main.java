package com.oop.compostion;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setEngine(new Engine("Germany","135"));
        System.out.println(c1.getEngine().getPower());

        Engine engine = new Engine("Germany","135");
        Car c2 = new Car("BMW","Black",4,engine);
    }
}