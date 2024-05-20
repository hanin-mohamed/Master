import javax.swing.plaf.IconUIResource;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
 public class javacode {
     public static int[] sumAndMax(int[] [] arr) {
         int sum = 0;
         int maxm = (int) -1e9;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 sum +=arr[i][j];
                 if (arr[i][j] > maxm) {
                 }
                 maxm = arr[i][j];
             }
         }
         return new int[] {sum, maxm};
     }

 }