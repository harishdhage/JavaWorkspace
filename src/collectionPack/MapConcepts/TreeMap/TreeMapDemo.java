package collectionPack.MapConcepts.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> tm = new TreeMap();
        tm.put(10,"aaple");
        tm.put(3,"msft");
        tm.put(13,"orcl");
        tm.put(11,"gm");
        tm.put(8,"lnt");

        Set<Map.Entry<Integer,String>> keySet = tm.entrySet();
        for (Map.Entry<Integer,String> mp : keySet){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

    }
}
