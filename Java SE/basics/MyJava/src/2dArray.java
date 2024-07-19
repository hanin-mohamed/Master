//import javax.swing.JOptionPane;
import javax.swing.plaf.IconUIResource;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;
import java.lang.*;
import java.util.*;
public class twodArray {
    public static void main(String[]args) {
        int arr[][] ={
            {1,5,2},
            {3,2},
            {5}};
      //  arr[0] = new int[4];
       // arr[1] = new int[3];
        //arr[2] = new int[2];
       // Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                // arr[i][j]=input.nextInt();
            }
            System.out.println();
        }
            // System.out.println(arr.length); // num of colums
        //System.out.println(arr[0].length);//num of ceach col
        //for (int i = 0; i < arr[2].length; i++) {
          //  System.out.print(arr[2][i]+" ");
        //}

    }


}
