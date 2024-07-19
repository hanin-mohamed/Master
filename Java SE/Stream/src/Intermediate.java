import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate {

public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        //<integer> to ensure that lamada expression (x*x) us true
        List<Integer> squares = numbers.stream()
                //map()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squares);
        //filter()
        List<String> names= Arrays.asList("Ahmed","Haiam","Haneen","Elzoz","Mohamed","Hanona");
        List<String> result= names.stream()
                .filter(s-> s.startsWith("H"))
                .collect(Collectors.toList()); // --> terminal
        System.out.println(result);

        //sorted()
        List<String> name= Arrays.asList("Yazed","Ahmed","Haiam","Haneen","Elzoz","Mohamed","Hanona");
        List<String> sorted= name.stream()
                .sorted()                      //intermediate
                .collect(Collectors.toList()); //terminal
        System.out.println(sorted);



    }
}
