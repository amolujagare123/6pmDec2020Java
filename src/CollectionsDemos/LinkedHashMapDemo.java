package CollectionsDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"Amol");
        lhm.put(222,"Smita");
        lhm.put(201,"Tejashree");
        lhm.put(121,"Shashin");
        lhm.put(301,"Komal");
        lhm.put(122,"Shashin");

        System.out.println("hm="+lhm);



    }
}
