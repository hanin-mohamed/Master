import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(100, 29, "Amena"));
        list.add(new Student(101, 21, "Hanona"));
        list.add(new Student(102, 23, "Hena"));
        Comparator<Student> cm = Comparator.comparing(Student::getName);
        Collections.sort(list, cm);
        System.out.println("Sorting by Name :");
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        Collections.sort(list, cm2);
        System.out.println("\nSorting by Age :");
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        list.add(new Student(100, 29, null));
        //null is less than non-null
        System.out.println("\nSorting by Name &null is less than non-null:");
        Comparator<Student> cm3 = Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
        Collections.sort(list, cm3);
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        //null is less than non-null
        System.out.println("\nSorting by Name &null is greater than non-null:");
        Comparator<Student> cm4 = Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        Collections.sort(list, cm4);
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
