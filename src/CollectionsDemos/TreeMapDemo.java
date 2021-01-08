package CollectionsDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(101,"Amol");
        tm.put(222,"Smita");
        tm.put(201,"Tejashree");
        tm.put(121,"Shashin");
        tm.put(301,"Komal");
        tm.put(122,"Shashin");

        System.out.println("hm="+tm);



    }
}
