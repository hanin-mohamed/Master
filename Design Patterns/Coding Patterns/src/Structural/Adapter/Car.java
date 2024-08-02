package Structural.Adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car Start to move");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car Stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep Beep !");
    }
}
