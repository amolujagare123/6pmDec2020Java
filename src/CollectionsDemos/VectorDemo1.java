package CollectionsDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector(){{
            add("smita");
            add("amol");
            add("tejashree");
            add("sachin");
        }};


        System.out.println(v);

    }

}
