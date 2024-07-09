package collectionPack.ListConcept.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPerformance {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        System.out.println("****** Array List addition  **********");
        long start = System.currentTimeMillis();
        for (int i = 0; i<=10000; i++){
            list.add(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("ArrayList add : "+(stop-start));
        System.out.println("Size : "+list.size());
        System.out.println("****** Array List remove  **********");
        start = System.currentTimeMillis();
        while (list.size() > 0){
            list.remove(0);
        }
        stop = System.currentTimeMillis();

        System.out.println("ArrayList remove : "+(stop-start));
    }
}
