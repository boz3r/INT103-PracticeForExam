package QueuePractice;

import java.util.*;

public class QueuePractice {

    public void MyQueue() {
        Queue<String> Food = new LinkedList<>();

        Food.add("Burger");
        Food.add("Fries");
        Food.add("Sausage");
        Food.add("Rice");

        System.out.println(Food);

        Food.remove(); //remove queue ตัวแรก คือ Burger

        System.out.println(Food);

        Food.remove("Rice"); //remove queue แบบ specific

        System.out.println(Food);

        Food.add("Steak");
        Food.add("Dumpling");

        System.out.println(Food);
    }
}
