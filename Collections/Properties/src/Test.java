import java.util.*;

public class Test {
    public static void main(String[] args) {
        Properties prop = System.getProperties();
        Set set =prop.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

}
