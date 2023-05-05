package singleton;

import java.util.*;

public class LazySingleton {
    private  String[] LETTERS = { "a" , "b" , "c" , "d" , "e" };

    private List<String> data = Arrays.asList(LETTERS);

    public static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
    private LazySingleton(){
        Collections.shuffle(data);
    }

    public void printData() {
        for (String item: data) {
            System.out.printf("%s ",item);
        }
        System.out.println();
    }
}
