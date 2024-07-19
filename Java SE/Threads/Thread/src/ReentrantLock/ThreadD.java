package ReentrantLock;

public class ThreadD implements Runnable{
    ReentrantLockClass rlc;
    public ThreadD(ReentrantLockClass rlc){
        this.rlc = rlc;
    }
    @Override
    public void run() {
        rlc.printt(5);
    }
}
