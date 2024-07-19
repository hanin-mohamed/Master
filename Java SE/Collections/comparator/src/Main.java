import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student(100,29,"Amena"));
        list.add(new Student(101,21,"Hanona"));
        list.add(new Student(102,23,"Hena"));
        System.out.println("Sorting by Age : ");
        Collections.sort(list,new CompAge());
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            Student student = (Student)itr.next();
            System.out.println(student.rollno+" "+student.name+" "+student.age);
        }
        System.out.println("\nSorting by Name : ");
        Collections.sort(list,new CompName());
        Iterator itr2 = list.iterator();
        while(itr2.hasNext()) {
            Student student = (Student)itr2.next();
            System.out.println(student.rollno+" "+student.name+" "+student.age);
        }
    }
}