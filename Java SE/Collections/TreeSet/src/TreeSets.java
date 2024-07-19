import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets  {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("x");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("k");
        set.add("a"); //ignore
        //ascending order
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(set.descendingSet());
        System.out.println(set.headSet("a"));
        System.out.println(set.subSet("a",false, "x",true));
        System.out.println(set.tailSet("c",false));
        System.out.println(set.headSet("c",true));


    }
}
