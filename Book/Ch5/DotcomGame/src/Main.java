import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        GameHelper helper = new GameHelper();
        Game dot = new Game();
        int numOfGuess = 0;
        int x = (int) (Math.random() * 5);
        int[] locates = new int[3];
        for (int i = 0; i < 3; i++) {
            locates[i] = x;
            x++;
        }
        dot.setLocates(locates);
        boolean isAlive = true;
        while (isAlive) {
            //System.out.println("Guess Cell");
            //String userGuess = scanner.nextLine();
            String userGuess = helper.getUserGuess("Enter your guess: ");
            String result = dot.check(userGuess);
            numOfGuess++;
            if (result=="Kill") {
                isAlive = false;
                System.out.println("You Guess : " +numOfGuess + " times");
            }
        }
    }
}
