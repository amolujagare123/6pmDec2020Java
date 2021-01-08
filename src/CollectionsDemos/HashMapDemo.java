package CollectionsDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"Amol");
        hm.put(222,"Smita");
        hm.put(201,"Tejashree");
        hm.put(121,"Shashin");
        hm.put(301,"Komal");
        hm.put(301,"Komal1");

        hm.put(122,"Shashin");

        System.out.println("hm="+hm);


        HashMap<Integer,String> hm1 = new HashMap<>();

        System.out.println("hm1="+hm1);

        hm1.putAll(hm);

        System.out.println("hm1="+hm1);


        System.out.println(hm.get(101));

        hm.remove(101);
        System.out.println("hm="+hm);

    }
}
