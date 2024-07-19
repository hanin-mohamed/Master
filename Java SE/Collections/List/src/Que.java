import java.util.Iterator;
import java.util.PriorityQueue;

public class Que {
    public static void main(String[] args) {
        PriorityQueue<String> pque=new PriorityQueue<String>();
        //sort secending
        pque.add("Haneen");
        pque.add("batoot");
        pque.add("Backend");
        //head element
        System.out.println(pque.element());
        System.out.println(pque.peek());
        //iterate on queue
        Iterator itr =pque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //remove
        pque.remove();
        pque.poll();
        System.out.println("After removing 2 elements: ");
        Iterator itr2 =pque.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
