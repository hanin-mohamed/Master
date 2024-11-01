package com.oop.abstraction;

public class  Dog extends Pets implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking");
    }

    @Override
    void shout() {
        System.out.println("Dog is barking");
    }
}
