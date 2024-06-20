import java.io.IOException;
import java.util.Scanner;

public class GameHelper {
    public String getUserGuess(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String guess = "";
        try{
            guess=scanner.nextLine();
        }
        catch(Exception e){
            System.out.println("Invalid input"+ e.getMessage());
        }
        return guess;
    }
}
