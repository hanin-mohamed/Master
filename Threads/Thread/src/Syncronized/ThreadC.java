package Syncronized;

public class ThreadC implements Runnable {

    Synchronized s;
    public ThreadC(Synchronized s) {
        this.s = s;
    }
    @Override
    public void run() {
        s.print(3);
    }
}
