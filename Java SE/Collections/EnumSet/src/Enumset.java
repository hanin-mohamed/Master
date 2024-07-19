import java.util.*;

public class Enumset {
    public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
        Set<Days> set2 = EnumSet.allOf(Days.class);
        Set<Days> set3 = EnumSet.noneOf(Days.class);
        set.add(Days.FRIDAY);
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

    }
}