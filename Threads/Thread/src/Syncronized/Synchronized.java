package Syncronized;

public class Synchronized {
Object lock = new Object();
    public void print(int cnt){
        System.out.println("Hanona");
        synchronized(lock) {
            for (int i = 0; i < 10; i++) {
                System.out.println(cnt * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
