import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
      //HashSet
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");  //ignore
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        set.remove("A");
        set.removeIf(str->str.contains("B"));
        System.out.println(set);


    }
}
