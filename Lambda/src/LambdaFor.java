import java.util.ArrayList;

public class LambdaFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Using lambda expression to print all elements");
          list.forEach(n-> System.out.println(n));
        System.out.println("Using lambda expression to print even elements");
          list.forEach(n->{
              if (n%2==0) System.out.println(n);
          });
    }
}
