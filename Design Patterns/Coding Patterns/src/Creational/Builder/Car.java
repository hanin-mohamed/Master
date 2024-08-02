package Creational.Builder;

public class Car {
    private String engine;
    private String transmission;
    private int airbags;

    public Car(String engine, String transmission, int airbags) {
        this.engine = engine;
        this.transmission = transmission;
        this.airbags = airbags;
    }

    public static class CarBuilder {   //inner class
        private String engine;
        private String transmission;
        private int airbags;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public Car build() {
            return new Car(engine, transmission, airbags);
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission + ", airbags=" + airbags + "]";
    }
}
