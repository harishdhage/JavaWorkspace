package Comparator;

import java.util.*;

//Sort String based on length using Comparator
public class CompareStringByLength {
    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if (i.length() < j.length())
                    return 1;
                else
                    return -1;
            }
        };

        List<String> stringList = new ArrayList<>();
        stringList.add("Chery");
        stringList.add("Banana");
        stringList.add("Musk Melon");
        stringList.add("Strawberry");
        stringList.add("Apple");

        Collections.sort(stringList, comparator);

        System.out.println(stringList);
    }
}
