import java.util.Iterator;
import java.util.Stack;

public class STk {
    public static void main(String args[]) {

        Stack<String> stk = new Stack<String>();
        //add->push
        stk.push("Hanoon");
        stk.push("Batota");
        stk.push("Just A girl");
        Iterator<String> itr = stk.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
