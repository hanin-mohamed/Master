package Creational.Factory;

import java.util.Random;

public class Game {
    static Random rand = new Random();
    public static void main(String[] args) {

        int x=6;
        while (x >0){
            Enemy enemy= EnemyFactory.createEnemy(getRandom(1,2));
            enemy.showUP();
            x--;
        }
    }
    public static int getRandom(int min, int max){
        return rand.nextInt((max - min) + 1) + min;
    }
}
