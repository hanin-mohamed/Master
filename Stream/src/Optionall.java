import java.awt.print.Book;
import java.util.*;
import java.lang.*;
import java.util.stream.Stream;

public class Optionall {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("Hello");
        Optional<String> nullableOptional = Optional.ofNullable(null);
        Optional<String> emptyOptional = Optional.empty();
        if (nonEmptyOptional.isPresent()) {
            System.out.println(nonEmptyOptional.get());
        }
        nonEmptyOptional.ifPresent(value -> System.out.println(value));

        String value = nullableOptional.orElse("Default Value");
        String value1 = nullableOptional.orElseGet(() -> "Default Value from Supplier");
        //String value2 = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value is not present"));

        //OptionalDouble & average
        int arr[]={10,20,30,50,80};
        OptionalDouble average = Arrays.stream(arr).average();
        Arrays.stream(arr).average().ifPresent(System.out::println);
        System.out.println(average);
        /******************************/
        Item java =new Item(1,"Java");
        Item oop = new Item(2,"OOP");
        Item python =new Item(3,"Python");
        Stream<Item> item=Stream.of(java, oop,python);
        //reduce
        double tot =item.reduce(0.0,(id,books)->
                id+books.getId(),Double::sum);
        System.out.println(tot);

        //findFirst
        Stream<Item> item2=Stream.of(java, oop,python);
        Optional<Item> firstItem =item2.findFirst();
        boolean isPresent =firstItem.isPresent();
        System.out.println(isPresent);
        System.out.println(firstItem);
        //findAny()
        Stream<Item> item3=Stream.of(java, oop,python);
        Optional<Item> anyItem =item3.findAny();
        anyItem.ifPresent(System.out::println);
    }
}
