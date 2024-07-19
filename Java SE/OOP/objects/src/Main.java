public class Main {
    public static void main(String[] args)
    {
        Mathh math=new Mathh();
        Mathh val1=new Mathh(4);
        Mathh val2=new Mathh(7);
        //Mathh val3=Mathh.add(val1,val2); -> static
        Mathh val3=val1.add(val2);
        System.out.println(val3.val);
        //comparing objects
        Mathh com1=new Mathh(7);
        Mathh com2=new Mathh(8);
        if (com1.isEqual(com2)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}