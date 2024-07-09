package collectionPack.MapConcepts.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map ihm = new IdentityHashMap();
        ihm.put(10,"aaple");
        ihm.put(3,"msft");
        ihm.put(13,"orcl");
        ihm.put(11,"gm");
        ihm.put(8,"lnt");

        Set<Map.Entry<Integer,String>> keySet = ihm.entrySet();
        for (Map.Entry<Integer,String> mp : keySet){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
