import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {
        //sort ascending
        SortedSet<String> set = new TreeSet<String>();
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("C");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
