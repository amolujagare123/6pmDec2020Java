package CollectionsDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("smita");
        ts.add("tejashree");
        ts.add("komal");
        ts.add("shashin");
        ts.add("amol");
        ts.add("valishali");


        System.out.println(ts);

        System.out.println(ts.add("amol"));

        System.out.println(ts);
    }
}
