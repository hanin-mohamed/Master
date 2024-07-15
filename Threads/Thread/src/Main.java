import ReentrantLock.ReentrantLockClass;
import ReentrantLock.ThreadD;
import ReentrantLock.ThreadE;

public class Main {
    public static void main(String[] args) {
//        ThreadA threadA = new ThreadA();
//        ThreadA threadA1 = new ThreadA();
//        Thread thread = new Thread(threadA);
//        Thread thread1 = new Thread(threadA1);
//        thread.start();
//        thread1.start();   //in Parallel
                 /**Syncronized**/
//        Syncronized.Synchronized sync = new Syncronized.Synchronized();
//        Syncronized.ThreadB threadB = new Syncronized.ThreadB(sync);
//        Syncronized.ThreadC threadC = new Syncronized.ThreadC(sync);
//        Thread thread3 = new Thread(threadB);
//        Thread thread4 = new Thread(threadC);
//        thread3.start();
//        thread4.start(); //Not in parallel Syncronized make one thread runs till the end
//                            // then next thread runs and so on..

//        /*****ReentrantLock*****/
//        ReentrantLockClass re = new ReentrantLockClass();
//        ThreadD threadD = new ThreadD(re);
//        ThreadE threadE = new ThreadE(re);
//        Thread thread5 = new Thread(threadD);
//        Thread thread6 = new Thread(threadE);
//        thread5.start();
//        thread6.start();  //lock the block untill thread finish then unlock it

        /**Wait , notify & notifyAll**/
        Threadd threadd = new Threadd();
        Thread thread7 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    threadd.work1();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadd.work2();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread7.start();
        thread8.start();

    }
}