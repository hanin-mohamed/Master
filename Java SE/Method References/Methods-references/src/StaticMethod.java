import java.util.function.Function;

public class StaticMethod {
    public static void main(String[] args) {
        Function<String, Integer> converter = Integer::parseInt; //of the class    \\]

        Integer converted = converter.apply("123");
        Integer converted2 = converter.apply("8989");
        System.out.println(converted);
        System.out.println(converted2);
    }
}
