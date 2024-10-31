package com.oop.inherit;

public class Boy extends Person {

    // constructor
    public Boy(){
        System.out.println("hey i am a boy");
    }

    public Boy(String name, boolean hasMilitaryService) {
        super(name);
        this.hasMilitaryService = hasMilitaryService;
    }

    public Boy(String name, String email, int age, double height, String grade, boolean hasMilitaryService) {
        super(name, email, age, height, grade);
        this.hasMilitaryService = hasMilitaryService;
    }

    private boolean hasMilitaryService;

    public boolean isHasMilitaryService() {
        return hasMilitaryService;
    }

    public void setHasMilitaryService(boolean hasMilitaryService) {
        this.hasMilitaryService = hasMilitaryService;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("as a boy");
    }

    @Override
    public String sayHello() {
        return "Hello, I am a boy";
    }
}