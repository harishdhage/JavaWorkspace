package collectionPack.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class ToArrayCheck {
    public static void main(String[] args)
    {
        // create object of ArrayList
        Collection<Integer> ArrLis
                = new ArrayList();


        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);

        // print ArrayList
        System.out.println(" ArrayList: " + ArrLis);

        // Get the array of the elements
        // of the ArrayList
        // using toArray() method
        Object[] arrObj = ArrLis.toArray();
        System.out.println(" Elements of ArrayList "
                + "as Object : "+Arrays.toString(arrObj));

        // Get the array of the elements
        // of the ArrayList
        // using toArray(T[]) method
        Integer arr[] = new Integer[ArrLis.size()];
        arr = ArrLis.toArray(arr);

        System.out.println(" Elements of ArrayList "
                + "as Array: "
                + Arrays.toString(arr));
    }
}
