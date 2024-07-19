import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Mohamed");
        map.put(3,"Ahmed");
        map.put(6,"Ali");
        map.put(2,"Haneen");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // compare keys , sort & print
        System.out.println("///////Sort Keys");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        // compare values&print
        System.out.println("////////Sort Values");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
