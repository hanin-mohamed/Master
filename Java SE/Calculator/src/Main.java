import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        Divid div = new Divid();
        Multiply mul = new Multiply();
        Sub sub = new Sub();
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter Operation");
        char operation = sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();
        switch (operation) {
            case '+' :
                System.out.println(add.operation(first,second));
                break;
            case '-':
                System.out.println(sub.operation(first,second));
                break;
            case '*':
                System.out.println(mul.operation(first,second));
                break;
            case '/':
                System.out.println(div.operation(first,second));
                break;
            default:
                System.out.println("Enter Valid input");
        }

    }
}