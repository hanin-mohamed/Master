import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    //finally can't  be called if we use System.exit(0);
    // cause programm will be stopped
    public static void main(String[] args) throws FileNotFoundException {
//        try{
//            int []arr= new int[5];
//            arr[6]=5;
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            return;
//        }
//        finally {
//            System.out.println("finally block");
//        }

        ////////
        System.out.println(getNumber());
        readFile("F:\\Java\\OOP\\Exception-Handling\\text.txt");
    }

    static int getNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    static void readFile(String filePath) throws FileNotFoundException {
        FileInputStream fin = new FileInputStream(filePath);
        System.out.println("File content : ");
        int r=0;
        while (true) {
            try {
                if ((r=fin.read())!=-1) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println((char)r);
        }


    }
}