package collectionPack.SetConcept.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        NavigableSet treeSet = new TreeSet();
        treeSet.add(12);
        treeSet.add(9);
        treeSet.add(33);
        treeSet.add(21);
        treeSet.add(15);
        treeSet.add(3);
        treeSet.add(20);

        try {
            treeSet.add(null);
        }catch (NullPointerException npe){
            System.out.println("Not allowed Null");
        }
        System.out.println(treeSet);

        System.out.println("***** Navigable Set *****");
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.ceiling(20));
        System.out.println(treeSet.floor(21));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet.lower(21));
        System.out.println(treeSet.higher(20));
        System.out.println(treeSet.headSet(21));
        System.out.println(treeSet.tailSet(20));
        System.out.println(treeSet.subSet(9 , 20));


    }
}
