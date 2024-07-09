package collectionPack.MapConcepts.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map lhm = new LinkedHashMap(16,1, true);
        lhm.put(10,"aaple");
        lhm.put(3,"msft");
        lhm.put(13,"orcl");
        lhm.put(11,"gm");
        lhm.put(8,"lnt");

        Set<Map.Entry<Integer,String>> keySet = lhm.entrySet();
        for (Map.Entry<Integer,String> mp : keySet){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }

    }
}
