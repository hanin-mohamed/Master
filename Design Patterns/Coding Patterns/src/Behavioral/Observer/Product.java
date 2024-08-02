package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private String availabilty;
    List<Observer> observers;
    public Product(String productName) {
        this.productName = productName;
        this.observers = new ArrayList<>();

    }


    @Override
    public void add(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(availabilty);
        }
    }

    public void setAvailabilty(boolean available) {
        availabilty = this.productName +( available?"Available" :"Not Available");
        notifyObservers();
    }
}
