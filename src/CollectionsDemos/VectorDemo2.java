package CollectionsDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(8,5);

        System.out.println("capaicty="+v.capacity());// 10
        System.out.println("Size="+v.size());// 0

        v.add("smita");
        v.add("Tejashree");
        v.add("komal");
        v.add("Shashin");
        v.add("amol");
        v.add("smita");
        v.add("Tejashree");
        v.add("komal");
        v.add("Shashin");
        v.add("amol");

        System.out.println("capaicty="+v.capacity());// 10
        System.out.println("Size="+v.size());// 11


        System.out.println(v);



    }

}
