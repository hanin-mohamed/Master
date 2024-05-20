public class Main {
    static void fun(Car car){
        car.autopilot();
    }
    public static void main(String[] args) {
        SUV car1 =new SUV();
        car1.autopilot();
        fun(new Hatcback());
    }
}