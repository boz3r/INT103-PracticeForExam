package ArrPractice;

import java.util.ArrayList;

public class ArrayListPractice {
        public static void printArrList(ArrayList<String> str, String msg) {
        for (String i : str) {
            System.out.println(msg+i);
        }
    }
    
    public static void ArrayList() {
        ArrayList<String> animals = new ArrayList(); 
        animals.add("dog");        
        animals.add("cat");
        animals.add("bird");
        printArrList(animals, "Pets in stock: ");
        
        
        animals.remove(2);
        printArrList(animals, "Pets after sold: ");
        System.out.println("Replace: "+animals.set(1, "Shark"));
        
        printArrList(animals, "Pets in stock: ");
    }
}
