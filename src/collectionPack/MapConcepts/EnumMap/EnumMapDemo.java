package collectionPack.MapConcepts.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Size,Integer> sizeMap = new EnumMap(Size.class);
        System.out.println(sizeMap);
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, XTRA_LARGE;
}
