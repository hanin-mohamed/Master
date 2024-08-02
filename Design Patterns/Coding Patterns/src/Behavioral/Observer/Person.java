package Behavioral.Observer;

public class Person implements Observer {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Person: " + name + " received: " + message);
    }
}
