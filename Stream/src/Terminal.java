import java.util.*;
import java.util.stream.Collectors;

public class Terminal {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,1,7, 8, 9, 10);
        //collect()->return result of the intermediate operations
        Set square= number.stream()
                .map(x-> x*x)
                .collect(Collectors.toSet());
        System.out.println(square);
        //forEach() -> iterate through every element
        number.stream()
                .forEach(y-> System.out.println(y+" "));

        // reduce()->return one val that exceed operations
        int even =number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println("SumOf evens : "+even);

        //count
        List<String> name= Arrays.asList("Yazed","Ahmed","Haiam","Haneen","Elzoz","Mohamed","Hanona");
        int count= (int) name.stream().count();
        System.out.println("Count is "+count);

    }
}
