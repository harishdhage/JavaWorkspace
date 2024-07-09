package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComp());
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("G");
        treeSet.add("c");
        treeSet.add("H");
        treeSet.add("A");
        treeSet.add("d");

        for (String str : treeSet){
            System.out.println(str+" ");
        }

    }
}

class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr){
        return aStr.compareTo(bStr);
    }
}
