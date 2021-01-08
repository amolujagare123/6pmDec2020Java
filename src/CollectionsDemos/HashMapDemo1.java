package CollectionsDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"Amol");
        hm.put(222,"Smita");
        hm.put(201,"Tejashree");
        hm.put(121,"Shashin");
        hm.put(301,"Komal");
        hm.put(122,"Shashin");

        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(102));
        System.out.println(hm.containsValue("Smita1"));
        System.out.println(hm.size());
       /* hm.clear();
        System.out.println("hm="+hm);
*/
        System.out.println(hm.isEmpty());

        Set s = hm.keySet();
        System.out.println("Set keys="+s);

        Collection c = hm.values();
        System.out.println("All values="+c);

        Set entrySet = hm.entrySet();
        System.out.println("Entry Set="+entrySet);



    }
}
