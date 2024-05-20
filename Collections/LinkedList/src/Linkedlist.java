import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String args[]) {
        LinkedList<String> list=new LinkedList<>();
        LinkedList<String> list2=new LinkedList<>();
        //add objects to LinkedList
        list.add("Hanona Elmaqnona");
        list.add(" 01559844210");
        list.add("Hanona Elmaqnona");
        list.add(" 01559844210");
        list.add("Java");
        list.add(" 01559844210");
        list.add(1,"Java");
        list.addFirst("Love");
        list.addLast("Life");
        list2.addAll(list);
        System.out.println(list);
        System.out.println(list2);
        list.addAll(1,list2);
        list.remove("Java");
        list.remove(0);
        list2.removeFirst();
        list2.removeLast();
        list.removeFirstOccurrence("01559844210");
        System.out.println(list);
        list.removeLastOccurrence("01559844210");
        System.out.println(list);
        list2.clear();
        System.out.println(list2);
        Iterator <String> itr=list.iterator();
        while (itr.hasNext())
            System.out.printf(itr.next()+"\n");
        /////////Traversing the list of elements in reverse order
        Iterator itr2 =list.descendingIterator();
        while (itr2.hasNext()) System.out.println(itr2.next());
        ////////////////
        List<Book> books=new LinkedList<Book>();
        Book b1=new Book(1,20,"Let us C","Haneen","Mohamed");
        Book b2=new Book(2,10,"I Love U","Haneen","Amged");
        Book b3=new Book(3,5,"In love With Java","Ahmed","Haneen");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        for (Book b:books)
            System.out.println("Book id : "  +b.id+", Quentity: "+b.quantity + " ,Auther: " +b.author+" ,Name: "+b.name+" ,Publisher: "+b.publisher);
        System.out.println(books.size());
    }
}