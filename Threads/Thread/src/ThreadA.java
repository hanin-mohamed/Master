public class ThreadA implements Runnable {
    private int cnt;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread() + " " + cnt++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
