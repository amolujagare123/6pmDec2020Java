package CollectionsDemos;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("smita");
        hs.add("Tejashree");
        hs.add("komal");
        hs.add("Shashin");
        hs.add("amol");
        hs.add("valishali");

        System.out.println(hs);

        System.out.println(hs.add("amol"));

        System.out.println(hs);
    }
}
