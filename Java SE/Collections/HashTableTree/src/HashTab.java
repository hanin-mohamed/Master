import java.util.Hashtable;

public class HashTab {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        //descending
        System.out.println(ht);
        System.out.println(ht.getOrDefault(1, "NotFound"));
        System.out.println(ht.getOrDefault(4, "NotFound"));
        ht.put(5, "D");
        ht.put(2, "B");
        System.out.println(ht);
        }
}