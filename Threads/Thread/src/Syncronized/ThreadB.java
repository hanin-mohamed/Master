package Syncronized;

public class ThreadB implements Runnable {
    Synchronized s;
    public ThreadB(Synchronized s) {
        this.s = s;
    }
    @Override
    public void run() {
        s.print(3);
    }
}
