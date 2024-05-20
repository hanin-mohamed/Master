import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("Hanen");
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("Alaa");
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }


}
