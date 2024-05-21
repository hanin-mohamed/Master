import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExistLambda_Ex {
    public static void main(String[] args) {

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(1); //accept method

        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get()); //get method

        Predicate<String>Predicate = x-> x.length() == 5;
        System.out.println(Predicate.test("Hello"));//test
        System.out.println(Predicate.test("HOn"));


        Item item = new Item(1,"Java");
        Consumer<Item> itemConsumer = it ->it.printDetails();
        Consumer<Item> itemConsumer2 = Item::printDetails;
        itemConsumer.accept(item);
        itemConsumer2.accept(item);

    }
}
