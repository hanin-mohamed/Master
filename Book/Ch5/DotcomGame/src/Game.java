public class Game {
    private int [] locates;
    private int numOfHits=0;

    public String check(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String res ="miss";
        // intial solution for the bug
        for(int i=0;i<locates.length;i++){
            if(guess == locates[i]){
                res = "hit";
                locates[i] = 0;
                numOfHits++;
                break;
            }
        }
        if(numOfHits==locates.length){
            res ="Kill";
        }
        System.out.println(res);
        return res;
    }
    public void setLocates(int[] locates) {
        this.locates = locates;
    }
}