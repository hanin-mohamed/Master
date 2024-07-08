package HotelSystem;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Room room;
    private Guest guest;
    private double price;
    private String status;
    private DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(LocalDate arrivalDate, LocalDate departureDate, Room room, Guest guest,String status, double price) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.room = room;
        this.guest = guest;
        this.price = price;
        this.status = status;
    }
    public Reservation(){}

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public void  display(){
        System.out.println("Guest Information : ");
        guest.display();
        System.out.print("Arrival Date: " + arrivalDate);
        System.out.println("    Departure Date: " + departureDate);
        int days = Period.between(arrivalDate, departureDate).getDays();
        double price = days * room.getPrice();
        System.out.println("Room Information: ");
        room.display();
        System.out.print("Check Information : ");
        System.out.println("Price: " + price);
        System.out.print("Total after discount : " + this.price);


    }
}
