import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMp {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> mp=new LinkedHashMap<Integer,String>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        System.out.println(mp.keySet());
        System.out.println(mp.values());

    }
}
