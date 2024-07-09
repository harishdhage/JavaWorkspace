package collectionPack.SetConcept.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Size> enumSet = EnumSet.allOf(Size.class);
        EnumSet<Size> enumSet1 = EnumSet.noneOf(Size.class);
        EnumSet<Size> enumSet2 = EnumSet.range(Size.MEDIUM, Size.XTRA_LARGE);
        EnumSet<Size> enumSet3 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("Enum Set contents of allOf : "+enumSet);
        System.out.println("Enum Set contents of noneOf : "+enumSet1);
        System.out.println("Enum Set contents of range : "+enumSet2);
        System.out.println("Enum Set contents of of() : "+enumSet3);
        enumSet3.add(Size.MEDIUM);
        System.out.println("Enum Set contents of of() after adding : "+enumSet3);
        enumSet3.remove(Size.SMALL);
        System.out.println("Enum Set contents of of() after remove : "+enumSet3);

        System.out.println("Using iterator for Enum");
        Iterator<Size> iterator = enumSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, XTRA_LARGE;
}
