package HotelSystem.controller;

import HotelSystem.Room;

import java.util.ArrayList;

public class RoomController {
   static Helper helper = new Helper();
   public static void addRoom(ArrayList<Room>rooms){
       System.out.println("Enter floor : ");
       int floor = helper.getInt();
       System.out.println("Enter capacity : ");
       int capacity = helper.getInt();
       System.out.println("Enter type : ");
       String type = helper.getString();
       System.out.println("Enter description (String): ");
       String description = helper.getString();
       System.out.println("Enter price (double): ");
       double price = helper.getDouble();
       int roomNo = 1000 + rooms.size();
       Room room = new Room(roomNo, floor, capacity, price, type, description);
       rooms.add(room);
       System.out.println("Room added successfully!");
       System.out.println();
   }
   public static void showRooms(ArrayList<Room>rooms){
       for(Room room : rooms){
           room.display();
       }
   }
    public static void updateRoom(ArrayList<Room> rooms) {
        System.out.println("Enter room number");
        int roomNo=helper.getInt();

        Room room =getRoomById(roomNo,rooms) ;

        System.out.println("Enter capacity : \n-1 to keep it");
        int capacity = helper.getInt();
        if (capacity==-1) capacity = room.getCapacity();
        System.out.println("Enter floor : \n-1 to keep it");
        int floor = helper.getInt();
        if (floor==-1) floor = room.getCapacity();
        System.out.println("Enter room type : \n-1 to keep it");
        String type = helper.getString();
        if (type.equals("-1")) type = room.getRoomType();

        System.out.println("Enter room description : \n -1 to keep it");
        String description = helper.getString();
        if (description.equals("-1")) description = room.getDescription();

        System.out.println("Enter room price : \n-1 to keep it");
        double price = helper.getDouble();
        if (price==-1) price = room.getPrice();

        room.setCapacity(capacity);
        room.setFloor(floor);
        room.setRoomType(type);
        room.setDescription(description);
        room.setPrice(price);
        for (Room rm : rooms) {
            if (rm.getRoomNo()==roomNo) {
                rm=room;
                break;
            }
        }
    }


    public static Room getRoomById(int id, ArrayList<Room> rooms) {
        Room room = new Room();
        for (Room r : rooms) {
            if (r.getRoomNo()==id) {
                room = r;
                break;
            }
        }
        return room;
    }

}
