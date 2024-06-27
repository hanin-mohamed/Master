import java.util.*;
//interface?
public class List {
    public static void main(String[] args) {
        java.util.List<String> list=new ArrayList();
        list.add("Hanen");
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Alaa");
       java.util.List<String> list1= java.util.List.of(
                "Haneen",
                "Ahmed",
                "Mohamed",
                "Alaa"
        );
       //list1.add("Hanona");--> error cause this list is immutable
        System.out.println(list1);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        

    }


}
