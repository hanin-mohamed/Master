package Creational.Singleton;

import java.util.*;

public class LazySingleton {
    private String[] letters = {"H","a","n","e","e","n"};
    private List<String> data =Arrays.asList(letters);
    private LazySingleton(){  //make constructor private
        Collections.shuffle(data);
    }

    //to take instance from class insted  of new , use getInstance() method
    private static LazySingleton instance;
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public void printData(){
        for(String s : data){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
