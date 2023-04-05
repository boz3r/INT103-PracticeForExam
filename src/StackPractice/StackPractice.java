package StackPractice;

import java.util.*;

public class StackPractice {

    public void MyStack() {
        Stack<String> Animal = new Stack<>();

        Animal.push("Dog");
        Animal.push("Cat");
        Animal.push("Dolphin");

        /*
            Search ของ stack จะไม่นับตาม index ของ array ที่เริ่มจาก 0 แต่เป็น 1 แทน
            และจะ search จากล่างขึ้นบน.
         */
        System.out.println(Animal);
        System.out.println("Dolphin at index: " + Animal.search("Dolphin") + " from the buttom.");

        Animal.pop();
        System.out.println("Pop dolphin: " + Animal);

        Animal.push("Shark");
        System.out.println("Push Shark: " + Animal);

        System.out.println("Is stack empthy: " + Animal.empty());
    }
}
