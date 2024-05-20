import java.util.*;
public class NongenericMap {
    public static void main(String[] args) {

        Map map=new HashMap();
        map.put(1,"Mohamed");
        map.put(3,"Ahmed");
        map.put(6,"Ali");
        map.put(2,"Haneen");

        /// print pair of Map
        System.out.println("Insertion Inputs");
        Set set =map.entrySet();
        Iterator itr =set.iterator();
        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}