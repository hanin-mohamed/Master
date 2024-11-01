package com.oop.polymorphism;

public class Main {
    public static void main(String[] args) {

        AnimalAC a1=new Dog(); // polymorphism -->  at runtime
        AnimalAC a2 =new Cat();
        a1.eat();
        a2.eat();

    }

    // overloading --> constructors are example
    public void add(int x, double y){

    }

    public void add(double x, int y){

    }
}