package HotelSystem;

import java.util.ArrayList;

public class Room {
    private int roomNo;
    private int capacity;
    private double price;
    private int floor;
    private String roomType;
    private String description;
    private ArrayList<String> revrsedDates;

    public Room(int roomNo,int floor, int capacity, double price, String roomType, String description) {
        this.roomNo = roomNo;
        this.floor = floor;
        this.capacity = capacity;
        this.price = price;
        this.roomType = roomType;
        this.description = description;
        revrsedDates = revrsedDates;
    }
    public Room() {}

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.print("Room No: " + roomNo);
        System.out.print("  Room Type: " + roomType);
        System.out.println("  Floor: " + floor);
        System.out.print("  Capacity: " + capacity);
        System.out.println("  Price: " + price);
        System.out.println("  Description: " + description);
        System.out.println();


    }
}
