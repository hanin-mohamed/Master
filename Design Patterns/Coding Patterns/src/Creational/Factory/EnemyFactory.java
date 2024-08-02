package Creational.Factory;

public class EnemyFactory {
    public static final int Bird =1;
    public static final int Turtle =2;
 public static Enemy createEnemy(int id) {
     switch (id) {
         case Bird:
             return new Bird();
         case Turtle:
             return new Turtle();

         default:
             return null;
     }
 }
}
