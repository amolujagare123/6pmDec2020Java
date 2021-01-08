package CollectionsDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("smita");
        lhs.add("Tejashree");
        lhs.add("komal");
        lhs.add("Shashin");
        lhs.add("amol");
        lhs.add("valishali");

        System.out.println(lhs);

        System.out.println(lhs.add("amol"));

        System.out.println(lhs);
    }
}
