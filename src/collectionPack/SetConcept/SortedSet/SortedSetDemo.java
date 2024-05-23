package collectionPack.SetConcept.SortedSet;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        System.out.println("********** SortedSet **********");
        SortedSet ss = new TreeSet<>();
        try {
            System.out.println(ss.first());
        }catch (NoSuchElementException nsee){
            System.out.println("NSEE thrown while retrivieving a empty sorted set!!!");
        }

        ss.add(4);
        ss.add(10);
        ss.add(13);
        ss.add(9);
        ss.add(17);
        ss.add(5);
        ss.add(-1);
        ss.add(-3);
        /*Set set = new TreeSet<>();
        set.add("Car");
        set.add("KTM");
        ss.add(new String("Google"));*/
        try {
//            System.out.println(ss.add(12));
            ss.add(new StringBuffer(43)); // Not allowed to add StringBuffer object
            // because its not implemented Comparable interface in TreeSet class or its parent
        }catch (ClassCastException cce){
            System.out.println("CCE thrown while adding incompatible object sorted set!!!");
        }
//        ss.addAll(set);
//		ss.add(null); Null is not allowed

        try {
            ss.add(null);
        }catch (NullPointerException npe){
            System.out.println("NPE thrown while adding null!!!");
        }

        System.out.println(ss.size() + " "+ss);
        System.out.println(ss.first()); // Returns the first index
        System.out.println(ss.last()); // Returns the last index
        System.out.println(ss.tailSet(5)); // Returns the tails set from element 5 to end of set
        System.out.println(ss.headSet(6)); // Returns the tails set from start to element 5
        System.out.println(ss.subSet(-1,9)); // Return subset from start to end-1

    }
}

