import java.util.ArrayDeque;
import java.util.Deque;

public class Deq {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1000);
        deque.add(2000);
        deque.add(3000);
        for (Integer i : deque) {
            System.out.println(i);
        }
    }
}
