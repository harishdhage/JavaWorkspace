package collectionPack.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Krakow");
        arrayList.add("28832");
        arrayList.add(2,"Mango");
        arrayList.add("AAPL");
        arrayList.add("RNR");

        System.out.println("******** Iterator ********");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n******** ListIterator ********");
        ListIterator<String> li = arrayList.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("\n******* List Iterator reverse iteration*******");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
