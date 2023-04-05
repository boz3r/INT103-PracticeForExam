package MapPractice;

import java.util.HashMap;
import java.util.TreeMap;

public class MapPractice {

    public void MyMap() {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("USA", "Burger");
        countries.put("CN", "Dumpling");
        countries.put("RU", "Vodka");
        countries.put("TH", "Tom yum kung");

        System.out.println("HashMap size: " + countries.size());
        System.out.println("HashMap China value: " + countries.get("CN"));

        countries.replace("CN", "Pork Chop");

        System.out.println("Is UK exist in HashMap Key: " + countries.containsKey("UK"));
        System.out.println("Is Vodka exist in HashMap Value: " + countries.containsValue("Vodka"));

        System.out.println("\n" + countries);

        countries.remove("CN");
        System.out.println("\nAfter Remove China...\n");

        for (String i : countries.keySet()) {
            System.out.print(i + ": ");
            System.out.println(countries.get(i));
        }
    }

    public void MyTree() {
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("USA", "Hot Dog");
        countries.put("UK", "Fish and Chips");
        countries.put("IT", "Pizza");
        countries.put("TH", "Pad kra pow");

        System.out.println("TreeMap size: " + countries.size());
        System.out.println("TreeMap China value: " + countries.get("USA"));

        countries.replace("CN", "Pork Chop");

        System.out.println("Is FN exist in TreeMap Key: " + countries.containsKey("FN"));
        System.out.println("Is Pizza exist in TreeMap Value: " + countries.containsValue("Pizza"));

        System.out.println("");

        System.out.println("\n" + countries);

        countries.remove("TH");
        System.out.println("\nAfter Remove Thailand...\n");

        for (String i : countries.keySet()) {
            System.out.print(i + ": ");
            System.out.println(countries.get(i));
        }
    }
}
