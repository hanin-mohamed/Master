import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Using lambda expression to print all elements");
        list.forEach(n -> System.out.println(n));
        System.out.println("Using lambda expression to print even elements");
        list.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });
    }

    //Methods
    public static void Options() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Java"));
        itemList.add(new Item(2, "Python"));
        itemList.add(new Item(3, "C++"));
        itemList.add(new Item(4, "C#"));
        findItemById(itemList, 4).ifPresent(python -> System.out.println(python));
    }

    public static Optional<Item> findItemById(List<Item> itemList, int id) {
        for (Item item : itemList) {
            if (item.getId() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
