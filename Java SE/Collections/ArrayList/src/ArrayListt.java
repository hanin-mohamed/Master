import java.io.*;
import java.util.*;

public class ArrayListt {
    //public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

    public static void main(String[] args) throws IOException {

        ArrayList<String> list =new ArrayList();
        ArrayList <String> list2 =new ArrayList<String>();
        //add object to arraylist
        list.add("Haneen");
        list.add("Mohamed");
        list.add("El-fiky");
        //Adding an element at the specific position
        list.add(1,"mohamed");
        //Adding second list elements to the first list
        list2.addAll(list);
        list2.retainAll(list);
        System.out.println(list2);
        //Adding second list elements to the first list at specific position
        list2.addAll(1,list);
        System.out.println(list2);
        list2.remove(3);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
        list.ensureCapacity(5);
        System.out.println(list2.isEmpty());
        System.out.println(list.lastIndexOf(list));
      //  System.out.println(list.toArray());
        System.out.println(list.clone());
        System.out.println(list.contains("Haneen"));
        System.out.println(list.get(1));
        //list.replaceAll(list.get(1));
        // move accross ArrayList ->Iterator
        Iterator itr=list.iterator(); //-> new iterator
        while (itr.hasNext())
            System.out.println(itr.next());
        // Iterate on reverse order
        ListIterator<String> listt =list.listIterator(list.size());
           while (listt.hasPrevious()) System.out.println(listt.previous());
        // For-each on reverse order
        list.forEach(a->{
            System.out.println(a);
        });

        //for each
        for (String name:list)
            System.out.println(name);
        //sort
        Collections.sort(list);
        System.out.println(list);
        //get&set
        list.set(2,"Amged");
        System.out.println("List After set 2: "+list.get(2));
        System.out.println("After set 2: "+list);
        //////////// sort class in ArrayList ->Student
        ArrayList<Student> Slist=new ArrayList<Student>();
        Student student1=new Student(100,"Haneen",21);
        Student student2=new Student(101,"Alaa",22);
        Student student3=new Student(102,"Mohamed",23);
        Slist.add(student1);
        Slist.add(student2);
        Slist.add(student3);
        Iterator itr2=Slist.iterator();
        while (itr2.hasNext()){
            Student student =(Student)itr2.next();
            System.out.println(student.name+" "+student.age+" "+student.rollno);
        }
        try
        {
            //Serialization
            FileOutputStream fos=new FileOutputStream("file");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream("file");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list3=(ArrayList)ois.readObject();
            System.out.println(list3);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        ///////Book in ArrayList
        List<Book> book=new ArrayList<Book>();
        Book b1=new Book(1,20,"Let us C","Haneen","Mohamed");
        Book b2=new Book(2,10,"I Love Programming","Haneen","Amged");
        Book b3=new Book(3,5,"In love With Java","Ahmed","Haneen");
        book.add(b1);
        book.add(b2);
        book.add(b3);
        for (Book b:book)
            System.out.println(b.id+" "+b.quantity + " " +b.author+" "+b.name+" "+b.publisher);
        System.out.println(book.size());

    }
}

