import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeLinkedHashMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>map=new TreeMap<Integer,String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        System.out.println(map.descendingMap());
        System.out.println(map.headMap(4,true));
        System.out.println(map.tailMap(2,false));
        System.out.println(map.subMap(2,false,5,true));
    }
}
