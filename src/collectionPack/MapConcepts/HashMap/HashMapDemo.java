package collectionPack.MapConcepts.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Apple",100213);
        hm.put("Samsumg",102421);
        hm.put("Nokia",1000);
        hm.put("Mi",3201);
        hm.put("Moto",24102);

        Set<Map.Entry<String,Integer>> set = hm.entrySet();
        for (Map.Entry<String,Integer> mp : set){
            System.out.println(mp.getKey()+" : "+mp.getValue());
        }

        int price = hm.get("Nokia");
        hm.put("Nokia",price+1500);

        System.out.println("Updated price "+hm.get("Nokia")+" for Nokia");
    }
}
