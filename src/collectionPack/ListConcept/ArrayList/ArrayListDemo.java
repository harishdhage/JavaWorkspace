package collectionPack.ListConcept.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Krakow");
        arrayList.add("28832");
        arrayList.add("AAPL");
        System.out.println(arrayList);
        arrayList.remove(1);
        arrayList.remove("AAPL");
        System.out.println(arrayList);
    }
}
