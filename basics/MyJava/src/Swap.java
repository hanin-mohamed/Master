public class Swap {
    public static void main(String[] args) {

        int num1=1,num2=2;
        System.out.println("Befor:");
        System.out.println(num1);
        System.out.println(num2);
        int temp =num1;
        num1=num2;
        num2=temp;
        System.out.println("After using temp:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("***********************");
        int num3=3,num4=4;
        System.out.println("Befor:");
        System.out.println(num3);
        System.out.println(num4);
        num3+=num4;
        num4=num3-num4;
        num3-=num4;
        System.out.println("After using 2operations:");
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("***********************");
        int num5=5,num6=6;
        System.out.println("Befor:");
        System.out.println(num5);
        System.out.println(num6);
        num5^=num6;
        num6=num5^num6;
        num5^=num6;
        System.out.println("After using 1operation (Xor):");
        System.out.println(num5);
        System.out.println(num6);


    }
}
