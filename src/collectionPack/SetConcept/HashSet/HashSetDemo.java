package collectionPack.SetConcept.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        //Complexity of HashSet is 0(1)
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(7);
        hashSet.add(5);
        hashSet.add(1); //Ignores the duplicate
        hashSet.add(null);
        System.out.println(hashSet);


        Set<String> hs = new HashSet<>();
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
