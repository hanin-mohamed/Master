package Structural.Adapter;

public class BicyleAdaptor implements Vehicle{
    private  Bicycle bicycle;
    public BicyleAdaptor(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    @Override
    public void accelerate() {
        bicycle.pedal();
    }

    @Override
    public void pushBreak() {
        bicycle.stop();
    }

    @Override
    public void soundHorn() {
        bicycle.ringBell();
    }
}
