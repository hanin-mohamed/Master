import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable(null);
        //Optional<String> str2 = Optional.of(null); //doesn’t accept null values
        Optional<String> str3 = Optional.empty();
        Optional str4 = Optional.of("Hena");
        System.out.println(str4.get());
        System.out.println(str.isPresent());
      //  System.out.println(str2.isPresent());
        System.out.println(str3.orElse("Haneen"));
        System.out.println(str.orElseGet(() -> "HOnn"));
        System.out.println(str.map(String::toUpperCase));
        System.out.println(str4.isEmpty());
        System.out.println(str.orElseThrow(RuntimeException::new));

    }
}