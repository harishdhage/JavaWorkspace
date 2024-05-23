package collectionPack.SetConcept.NavigableInteface;

import java.util.*;

public class NavigatableSetDemo {
    public static void main(String[] args) {
        System.out.println("********** SortedSet **********");
        NavigableSet navigableSet = new TreeSet<>();
        try {
            System.out.println(navigableSet.first());
        }catch (NoSuchElementException nsee){
            System.out.println("NSEE thrown while retrivieving a empty sorted set!!!");
        }
        navigableSet.add(3);
        navigableSet.add(2);
        navigableSet.add(10);
        navigableSet.add(5);
        navigableSet.add(17);
        navigableSet.add(1);
        navigableSet.add(12);
        navigableSet.add(8);
        navigableSet.add(11);
        navigableSet.add(9);
        /*Set<String> set = new TreeSet<>();
        set.add("Car");
        set.add("KTM");
        navigableSet.addAll(set);*/
//		navigableSet.add(null); Null is not allowed

        try {
            navigableSet.add(null);
        }catch (NullPointerException npe){
            System.out.println("NPE thrown while adding null!!!");
        }

        System.out.println("***** Navigable Set *****");
        System.out.println(navigableSet.descendingSet()); //Returns the set in descending order
        System.out.println(navigableSet.ceiling(15)); // Returns the next higher element from 15 in a given set
        System.out.println(navigableSet.floor(15)); // Returns the next lower element before 15 in a given set
        System.out.println(navigableSet.ceiling(10)); // Returns the 10 as logic is higher >= 10
        System.out.println(navigableSet.floor(10)); // Returns the 10 as logic is lower <= 10
        System.out.println(navigableSet.pollFirst()); // Return first index element
        System.out.println(navigableSet.pollLast()); // Returns the last index element
        System.out.println(navigableSet.lower(10)); // next lower element before 10
        System.out.println(navigableSet.higher(10)); //Next higher element after 10
        System.out.println(navigableSet.headSet(10)); //Gives the subset from first index to element 10 (excluding 10)
        System.out.println(navigableSet.tailSet(10)); // Gives the subset from element 10 to end
    }
}
