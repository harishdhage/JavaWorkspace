package collectionPack.ListConcept.ArrayList;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Krakow");
        arrayList.add("28832");
        arrayList.add(2,"Mango");
        arrayList.add("AAPL");
        System.out.println(arrayList.size()+" "+arrayList);
        arrayList.add(0,"Warsaw");
        arrayList.remove(1);
        arrayList.remove("AAPL");
        System.out.println(arrayList.size()+" "+arrayList);
        System.out.println("********************************************");
        String[] ark = new String[arrayList.size()];
        arrayList.toArray(ark);
        for (String x: ark) {
            System.out.print(x+" ");
        }

        System.out.println("\n********************************************");
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(30, 31, 32));
        arrayList1.ensureCapacity(3);
        for (int i = 10; i < 20; i++){
            arrayList1.add(i);
        }
        System.out.println(arrayList1.size()+" "+arrayList1);
        arrayList1.trimToSize();
        System.out.println(arrayList1.size()+" "+arrayList1);
        System.out.println("********************************************");
        Integer[] ar1 = new Integer[arrayList1.size()];
        arrayList1.toArray(ar1);
        for (int x: ar1) {
            System.out.print(x+" ");
        }

        System.out.println("********************************************");
        System.out.println("Make arrayList as unmodifiable");
        List unmodifiable_List = Collections.unmodifiableList(arrayList1);
        unmodifiable_List.add("Levies");
        System.out.println(unmodifiable_List);
    }
}
