package ReentrantLock;

public class ThreadE implements Runnable {
    ReentrantLockClass rlc;
    public ThreadE(ReentrantLockClass rlc){
        this.rlc = rlc;
    }
    @Override
    public void run() {
        rlc.printt(5);
    }
}
