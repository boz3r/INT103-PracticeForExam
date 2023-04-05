package SetPractice;

import java.util.*;

public class SetPractice {

    public void MySet() {
        Set<String> myhashset = new HashSet<>();

        myhashset.add("Rice");
        myhashset.add("Sausage");
        myhashset.add("Ketchup");

        Iterator<String> hashit = myhashset.iterator();
        /*
            ใช้ loop ได้เหมือนกัน
            myhashset.forEach(System.out::println);
        */
        while (hashit.hasNext()) {
            System.out.println("Hash Set: "+hashit.next());
        }
        
        /*
            Sort ตาม Alphabet
        */
        Set<String> mytreeset = new TreeSet<>();
        
        mytreeset.add("Omlet");        
        mytreeset.add("Coke");
        mytreeset.add("Hot Sauce");

        Iterator<String> treeit = mytreeset.iterator();
        
        while(treeit.hasNext()) {
            System.out.println("Tree Set: "+treeit.next());
        }
    }
}
