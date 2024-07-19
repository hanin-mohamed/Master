public abstract class Car {
    float height,weight;
    int numofWheels;

    public Car() {
    }

    public Car(float height, float weight, int numofWheels) {
        this.height = height;
        this.weight = weight;
        this.numofWheels = numofWheels;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumofWheels() {
        return numofWheels;
    }

    public void setNumofWheels(int numofWheels) {
        this.numofWheels = numofWheels;
    }
    abstract void  autopilot();
    abstract   void streamServices();
    abstract void parkSensors();

    public float getHeight() {
        return height;
    }


}
