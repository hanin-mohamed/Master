//import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;
public class overloading {
    static int sum(int num,int num2){
        return num+num2;
    }
    static float sum(float num,float num2){
        return num+num2;
    }
    static int sum(int num,int num2,int num3){
        return num+num2+num3;
    }
    static float sum(float num,int num2){
        return num+num2;
    }
    public static void main(){
        System.out.println("overloading of main");
    }

    public static void main(String []args){
        System.out.println("sum= "+sum(10,10));
        System.out.println("sum= "+sum(6.7f,5.8f));
        System.out.println("sum= "+sum(10,10,20));
        System.out.println("sum= "+sum(19.6f, 6));
        main();
    }
}
