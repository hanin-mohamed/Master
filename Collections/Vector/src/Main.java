import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>(4);
        vec.add("Haneen");
        vec.add("Elzoz");
        vec.add("Dodo");
        vec.add("Mohamed");
        vec.addElement("Ahmed");
        System.out.println("Size: "+vec.size()+" "+"Capacity: "+ vec.capacity());
        vec.add("Mohamed");
        vec.add("Hanona");
        vec.add("Mohamed");
        System.out.println("Size: "+vec.size()+" "+"Capacity: "+ vec.capacity());
        System.out.println(vec.contains("Dodo"));
        vec.remove("Dodo");
        System.out.println(vec.contains("Dodo"));
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        System.out.println(vec.remove("Mohamed")); //first occourence
        vec.removeElementAt(4);
        System.out.println(vec.hashCode());
        System.out.println(vec.get(2));


    }
}