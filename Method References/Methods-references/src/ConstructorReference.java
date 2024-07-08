import java.util.function.Supplier;

public class ConstructorReference {
    //ClassName::new
    public static void main(String[] args) {
        Supplier<ConstructorReference> supplier = ConstructorReference::new;
        ConstructorReference obj = supplier.get();
        System.out.println(obj);
    }
}
