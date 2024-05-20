//import javax.swing.JOptionPane;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
import java.util.ArrayList;
public class arrayList{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String name = a.nextLine();
        while (!name.equalsIgnoreCase("quit")) {
            names.add(name);
            name=a.nextLine();
        }
        //for (String i : names)
            System.out.println(names);
        System.out.println("enter random num");
        int index=a.nextInt();
        System.out.println(names.get(index));
        for (int i=0;i<names.size();i++){
            {
               /* for (int j=0;j<names.size();j++){
                    if(arrayList)
                }*/
            }
        }

    }

}





















       /* String syear=JOptionPane.showInputDialog("enter year");
        int year=Integer.parseInt(syear);
        boolean mes=((year%4==0)&&(year%100!=0)||(year%400==0));
        JOptionPane.showMessageDialog(null,year+" isleap? "+mes);*/
       /* Scanner input=new Scanner(System.in);
        int radius;
        radius=input.nextInt();

        double area;
        if (radius >= 0) {
           area = radius * radius * 3.14159;
            System.out.println("The area for the "
                    + "circle of radius " + radius +
                    " is " + area);
        } else {
            System.out.println("Negative input");
*/
/*
                // Read an initial data
                String dataString = JOptionPane.showInputDialog(null,
                        "Enter an int value, \nthe program exits if the input is 0",
                        "Example 3.2 Input", JOptionPane.QUESTION_MESSAGE);
                int data = Integer.parseInt(dataString);
                // Keep reading data until the input is 0
                int sum = 0;
                while (data != 0) {
                    sum += data;
                    // Read the next data
                    dataString = JOptionPane.showInputDialog(null,
                            "Enter an int value, \nthe program exits if the input is 0",
                            "Example 3.2 Input", JOptionPane.QUESTION_MESSAGE);
                    data = Integer.parseInt(dataString);
                }
                JOptionPane.showMessageDialog(null, "The sum is " + sum,
                        "Example 3.2 Output", JOptionPane.INFORMATION_MESSAGE);

        int data;
        int sum = 0;
        // Keep reading data until the input is 0
        do {
            // Read the next data
            String dataString = JOptionPane.showInputDialog(null,"Enter an int value, \nthe program exits if the input is 0" ,"TestDo", JOptionPane.QUESTION_MESSAGE);
            data = Integer.parseInt(dataString);
            sum += data;
        } while (data != 0);
        JOptionPane.showMessageDialog(null, "The sum is " + sum,"TestDo",JOptionPane.INFORMATION_MESSAGE);

}
    }

    import javax.swing.*;
        public class Main {
            public static void main(String[] args) {
                JFrame frame = new JFrame("hanoon.com");
                // Add a button into the frame
                java.awt.Container container = frame.getContentPane();
                JButton jbtOK = new JButton("hanoon");
                container.add(jbtOK);
                frame.setSize(400, 300);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }

import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("CenterFrame");
        frame.setSize(400, 300);
        // New since JDK 1.3 to exit the program upon closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Get the dimension of the screen
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        // Locate the upper-left corner (x, y) of the centered frame
        int x = (screenWidth - frame.getWidth()) / 2;
        int y = (screenHeight - frame.getHeight()) / 2;
        // Set the location of the frame
        frame.setLocation(x, y);
        frame.setVisible(true);
    }}
       int num1=3, num2=7;
        System.out.println("After");
        swap(num1, num2);
        System.out.println("Before");
        System.out.println("num1 = "+num1+" num2 = "+num2);}

        public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;

            System.out.println("num1= "+x+" num2= "+y);


        System.out.println("cels.temp");
        for(double i=40;i>30;i--){
            double fhr=fahr(i);
            System.out.println(i+"             "+ fhr);

        }
    }
    public static double fahr(double c){
        return (9.0/5)*c+32;
*/

