import java.util.function.Supplier;

public class InstanceMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Supplier<Integer> supplier = str::length; //instance of a particular object
        Integer length = supplier.get();
        System.out.println(length);
    }
}
