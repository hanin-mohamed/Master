package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new BicyleAdaptor(new Bicycle());
        playWithVehicle(bicycle);
        playWithVehicle(car);

    }
    private static void playWithVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }
}
