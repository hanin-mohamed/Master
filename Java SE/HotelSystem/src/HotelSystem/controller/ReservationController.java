package HotelSystem.controller;

import HotelSystem.Guest;
import HotelSystem.Reservation;
import HotelSystem.Room;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservationController {
    static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void createReservation(ArrayList<Guest>guests, ArrayList<Room> rooms, ArrayList<Reservation>reservation) {

    }

    public static void showReservations(ArrayList<Reservation> reservations, Scanner scanner) {
        for (Reservation r : reservations) {
            System.out.print("id: "+reservations.indexOf(r));
            System.out.print("  Arrival Date: " + r.getArrivalDate());
            System.out.print("  Departure Date: " + r.getDepartureDate());
            System.out.print("  Guest Name: " + r.getGuest().getFirstName());
            System.out.print("  Room id: " + r.getRoom().getRoomNo());
            System.out.print("  Price: "+ r.getPrice());
            System.out.print("  Status: "+r.getStatus());
        }
    }
    public static void getResernationByGuestName(ArrayList<Reservation> reservations) {
        System.out.println("Enter guest name : ");
        String guestName = scanner.nextLine();
        for (Reservation r : reservations) {
            String name = r.getGuest().getFirstName();
            if (name.equals(guestName)) {
                r.display();
            }
        }
    }
    public static void getReservationByGuestId (ArrayList<Reservation> reservations, Scanner scanner) {
        System.out.println("Enter guest id : ");
        String guestId = scanner.nextLine();
        for (Reservation r : reservations) {
            if (guestId.equals(r.getGuest().getFirstName())) {
                r.display();
            }
        }
    }
    public static void editResrvation(ArrayList<Reservation> reservations,ArrayList<Room>rooms,ArrayList<Guest>guests, Scanner scanner) {
        System.out.println("Enter Reservation id : ");
        int reservationId = scanner.nextInt();
        Reservation reservation = reservations.get(reservationId);
        System.out.println("Enter arrival date : \n or -1 if you will keep it");
        String arrivalDate = scanner.nextLine();
        if (arrivalDate.equals("-1")) {
            arrivalDate = String.valueOf(reservation.getArrivalDate());
        }
        System.out.println("Enter deputure Date : \n or -1 if you will keep it");
        String departureDate = scanner.nextLine();
        if (departureDate.equals("-1")) {
            departureDate = String.valueOf(reservation.getDepartureDate());
        }
        System.out.println("Enter room id : \n or -1 if you will keep it");
        int roomId = scanner.nextInt();
        if (roomId==-1) {
            roomId = reservation.getRoom().getRoomNo();
        }
        LocalDate arrDate = LocalDate.parse(arrivalDate, formatter);
        LocalDate depDate = LocalDate.parse(departureDate, formatter);
        Guest guest = reservation.getGuest();
        Room room = RoomController.getRoomById(roomId,rooms);



    }
    public static void payForReservation(ArrayList<Reservation> reservations, Scanner scanner) {
        System.out.print("Enter id: \n-1 to show all reservations ids ");
        int id =scanner.nextInt();
        if (id==-1) {
            showReservations(reservations, scanner);
            System.out.println("Enter reservation id (int): ");
            id = scanner.nextInt();
        }
        Reservation reservation = reservations.get(id);
        if (reservation.getStatus().equals("Reserved")){
            reservation.setStatus("Paid");
            System.out.println("Reservation has been paid ");
        }
        else
            System.out.println("Reservation is already paid ");
    }
}
