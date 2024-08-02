package Behavioral.Observer;

public class Exec {
    public static void main(String[] args) {
        Product phone = new Product("Iphone");
        Person haneen =  new Person("Haneen");
        Person ahmed  = new Person("Ahmed");
        Person mohamed = new Person("Mohamed");
        phone.add(haneen);
        phone.add(ahmed);
        phone.add(mohamed);
        for (int i = 0; i < 5; i++) {
            boolean available =i%2==0;
            phone.setAvailabilty(available);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }


    }
}
