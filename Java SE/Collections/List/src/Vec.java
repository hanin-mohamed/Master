import java.util.Iterator;
import java.util.Vector;

public class Vec {
    public static void main(String args[]){

        Vector<Integer> vec =new Vector<Integer>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        Iterator<Integer>itr=vec.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
