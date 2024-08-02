package Creational.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreadSafeSingleton {
    private String[] letters = {"H","a","n","e","e","n"};
    private List<String> data = Arrays.asList(letters);
    private ThreadSafeSingleton(){  //make constructor private
        Collections.shuffle(data);
    }

    //to take instance from class insted  of new , use getInstance() method
    private static volatile ThreadSafeSingleton instance;
    private static boolean delayMe =true;
    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null){
            if(delayMe){
                delayMe = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);}
                catch (InterruptedException e){}
                }

            instance = new ThreadSafeSingleton();
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
