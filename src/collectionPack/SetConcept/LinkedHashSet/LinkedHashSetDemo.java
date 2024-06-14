package collectionPack.SetConcept.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Complexity of LinkedHashSet is 0(1)
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(5);
        linkedHashSet.add(1); //Ignores the duplicate
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);


        Set<String> hs = new LinkedHashSet<>();
        //Addition
        hs.add("Canada");
        hs.add("Banana");
        hs.add("Decom");
        hs.add("China");
        hs.add("India");
        hs.add("Banana");

        //Search
        System.out.println(hs.contains("Banana"));
        System.out.println(hs);

        //Delete
        hs.remove(1); // Doesnot support the index based remobe as Hashset is not gaurentee's order of inserted data
        System.out.println(hs);
        hs.remove("Banana");
        System.out.println(hs);

        hs.clear();
        System.out.println("After Clear : "+hs);


    }
}
