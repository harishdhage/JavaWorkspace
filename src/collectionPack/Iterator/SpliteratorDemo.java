package collectionPack.Iterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList();
        arrayList.add(30.01);
        arrayList.add(26.96);
        arrayList.add(29.00);
        arrayList.add(31.01);

        System.out.println("**** Spliterator *******");

        System.out.println("\n**** Using tryAdvance() ********");
        Spliterator<Double> spliterator = arrayList.spliterator();
        while (spliterator.tryAdvance((n)-> System.out.println(n)));

        System.out.println("\n create new list that contains sqr root");
        spliterator = arrayList.spliterator();
        ArrayList<Double> arrayList1 = new ArrayList<>();
        while (spliterator.tryAdvance((n)->arrayList1.add(Math.sqrt(n))));
        System.out.println(arrayList1);

        System.out.println("\n******* Using forEachRemaining *******");
        spliterator = arrayList1.spliterator();
        spliterator.forEachRemaining((n)-> System.out.println(n));
    }
}
