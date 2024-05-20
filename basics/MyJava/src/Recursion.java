//import javax.swing.JOptionPane;
import javax.swing.plaf.IconUIResource;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;
public class Recursion {
  /*static int count=0;
    public static void fun()
    {
        if (count==5)//base case
            return;

            System.out.println("hi");
        count++;
            fun();
    }*/
  //*****factorial;
  /*  public static long fact(int num){  //5  4  3  2  1
        if(num==1 || num==0)  //base case
          return 1;   //1
        else
          return num*fact(num-1);  //5*4*3*2*1
    }*/
 /* static void fun(int num){
    if (num<1)
      return;
    else
      fun(num-1);
      System.out.print("*"+num+" ");
      //fun(num-1);      //direct recursion
  }*/
  //*********fibonacci series -->  0 1 1 2 3 5 8 13 21 34 55...
    public static int fib(int num){
        if (num==0 || num==1)
            return num;
        else
            return fib(num-2)+fib(num-1);

    }

    public static void main(String []args){
       // fun();
    /*  Scanner input=new Scanner(System.in);
      int num=input.nextInt();  //5
      System.out.println("factorial of "+num+" = "+fact(num));
      fun(6);*/
//*********************fibonacci
        System.out.println(fib(7));

    }
}
