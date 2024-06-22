import java.util.ArrayList;

public class Dotcom
{
    
    private ArrayList<String> locates;
    private int numOfHits=0;

    public String check(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String res = "miss";
        // Efective Solution
        int idx = locates.indexOf(userGuess);
        if (idx >= 0) {
            locates.remove(idx);

            if (locates.isEmpty()) {
                res = "Kill";
            }
        }
        System.out.println(res);
        return res;

    }
    public void setLocates(ArrayList<String> locates) {
        this.locates = locates;
    }
}