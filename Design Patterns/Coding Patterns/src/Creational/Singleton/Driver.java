package Creational.Singleton;

public class Driver {
    public static void main(String[] args) {
        //Before Singleton
//        LazySingleton list1 = new LazySingleton();
//        LazySingleton list2 = new LazySingleton();

        /* Using LazySingleton
        LazySingleton list1 =LazySingleton.getInstance();
        LazySingleton list2 =LazySingleton.getInstance();
        list1.printData();
        list2.printData();*/

            // Using ThreadSafeSingleton
            new DataPrinter().start();
            new DataPrinter().start();
    }
}
class DataPrinter extends Thread{
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
