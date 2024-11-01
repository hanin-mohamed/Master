package com.oop.abstraction;

public class Cat extends Pets implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking");
    }

    @Override
    void shout() {
        System.out.println("Cat is shouting");
    }
}
