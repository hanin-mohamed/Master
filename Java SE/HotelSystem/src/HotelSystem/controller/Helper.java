package HotelSystem.controller;

import java.util.Scanner;

public class Helper {
    public String getString(){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        try{
            input=scanner.nextLine();
        }
        catch(Exception e){
            System.out.println("Invalid input"+ e.getMessage());
        }
        return input;
    }
    public int getInt(){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try{
            input=scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid input"+ e.getMessage());
        }
        return input;
    }
    public double getDouble(){
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        try{
            input=scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid input"+ e.getMessage());
        }
        return input;
    }

}
