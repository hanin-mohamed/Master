package Creational.Builder;

public class BuilderTest {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setAirbags(6)
                .build();

        System.out.println(car);
    }
}
