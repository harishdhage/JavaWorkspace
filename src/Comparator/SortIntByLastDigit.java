package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort integer based on last digit using Comparator

public class SortIntByLastDigit {

    public static void main(String[] args) {

        Comparator<Integer> integerComparator = new Comparator<>() {
            public int compare(Integer x, Integer y) {
                if(x%10 > y%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(10);
        integerList.add(42);
        integerList.add(9);
        integerList.add(61);

        Collections.sort(integerList, integerComparator);

        System.out.println(integerList);
    }
}
