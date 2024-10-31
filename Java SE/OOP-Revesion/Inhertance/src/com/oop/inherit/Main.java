package com.oop.inherit;

public class Main {
    public static void main(String[] args) {

        Boy b1= new Boy();
        b1.setName("John");
        b1.setAge(10);
        b1.setHasMilitaryService(false);
        b1.eat();
        String helloBor=b1.sayHello();
        System.out.println(helloBor);


        Girl g1= new Girl();
        g1.setName("Jane");
        g1.setAge(14);
        g1.eat();

        String helloGirl=g1.sayHello();
        System.out.println(helloGirl);



        // constructors in inheritance
        Boy b = new Boy();
    }
}