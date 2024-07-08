import java.util.Arrays;
import java.util.List;

public class ClassMemberMethod {
    // x.methodName(y)
    public static void main(String[] args) {
        //instance method of any object of a specific type using
        List<String> names = Arrays.asList("John", "Jane", "Jack"); 
        names.forEach(System.out::println);
    }
}
