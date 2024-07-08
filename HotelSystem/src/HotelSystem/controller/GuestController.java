package HotelSystem.controller;

import HotelSystem.Guest;

import java.util.ArrayList;

public class GuestController {
    static Helper helper =new Helper();
 public static void addGuest(ArrayList<Guest> guests) {
     System.out.println("Enter Guest Name ,Please :");
     String name= helper.getString();
     System.out.println("Enter Guest Email ,Please :");
     String email= helper.getString();
     System.out.println("Enter discount  ,Please :");
     int discount= helper.getInt();
     guests.add(new Guest(guests.size(),name,email,discount));
 }
 public static void deleteGuest(ArrayList<Guest> guests) {
     System.out.println("Enter Guest ID ,Please :");
     int guestID= helper.getInt();
     guests.remove(guestID);
 }
 public static void updateGuest(ArrayList<Guest> guests) {
     System.out.println("Enter Guest ID ,Please :");
     int guestID= helper.getInt();
     System.out.println("Enter Guest Name ,Please :");
     String guestName= helper.getString();
     System.out.println("Enter Guest Email ,Please :");
     String guestEmail= helper.getString();
     System.out.println("Enter discount  ,Please :");
     int discount= helper.getInt();
     Guest guest = guests.get(guestID);
     guest.setDiscount(discount);
     guest.setEmail(guestEmail);
     guest.setFirstName(guestName);
     guests.set(guestID,guest);
 }
 public static void displayGuests(ArrayList<Guest> guests) {
     for (Guest guest : guests) {
         guest.display();
         System.out.println();
     }
 }
 public static void searchByName(ArrayList<Guest> guests){
     System.out.println("Enter Guest Name ,Please :");
     String name= helper.getString();
     for (Guest guest : guests) {
         if (guest.getFirstName().equals(name))
             guest.display();
     }
 }

}
