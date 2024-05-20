import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(null, "Five");
        map.put(null,"mahmoud"); //one key can be null ->override
        map.put(8,null);
        map.put(9,null);
        map.putIfAbsent(6,"Hanona");
        //map.put(1, "Four"); //No Duplicate values ->Last value of key   override
        System.out.println("Iterating HashMap...\n");
        for (Map.Entry m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        HashMap<Integer,String>mp=new HashMap<Integer,String>();
        mp.put(1, "Second");
        mp.putAll(map);
        System.out.println("//////////Second Map\n");
        for (Map.Entry m: mp.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        mp.replace(8,"Replaced");
        mp.replace(9,null,"Replaced2");
        for (Map.Entry m: mp.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        map.replaceAll((k,v) -> "Hanona");
        for (Map.Entry m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        //K_based Removal
        map.remove(3);
        //Value_based Removal
        map.remove("Ahmed");
        //K&Value_based Removal
        map.remove(1,"one");
        for (Map.Entry m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());


        /////////book class
        Map<Integer,Book> map2=new HashMap<Integer,Book>();
        Book b1=new Book(101,5,"Let us C","Yashwant Kanetkar","BPB");
        Book b2=new Book(102,10,"Data Communications & Networking","Forouzan","Mc Graw Hill");
        Book b3=new Book(103,20,"Operating System","Galvin","Wiley");
        map2.put(1,b1);
        map2.put(2,b2);
        map2.put(3,b3);
        for (Map.Entry<Integer,Book>entry: map2.entrySet()){
            int key= entry.getKey();
            Book b=entry.getValue();
            System.out.println("Key "+key+" Details : " );
            System.out.println(b.id+b.name+b.publisher+b.author+b.quantity);
        }
    }
}
