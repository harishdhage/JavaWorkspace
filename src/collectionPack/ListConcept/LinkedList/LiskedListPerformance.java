package collectionPack.ListConcept.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LiskedListPerformance {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        System.out.println("****** Linked List addition  **********");
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list.add(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("LinkedList add : " + (stop - start));
        System.out.println("Size : " + list.size());
        System.out.println("****** Linked List remove  **********");
        start = System.currentTimeMillis();
        while (list.size() > 0) {
            list.remove(0);
        }
        stop = System.currentTimeMillis();

        System.out.println("LinkedList remove : " + (stop - start));
        System.out.println("Size :"+list.size());

    }
}
