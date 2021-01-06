package CollectionsDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCapacityDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("smita");
        v.add("Tejashree");
        v.add("komal");
        v.add("Shashin");
        v.add("amol");
        v.add("valishali");

        System.out.println(v);

        System.out.println("==== Using enumeration =========");

        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

         Object[] obj  = v.toArray();

        System.out.println("==== Using Converted array =========");
         for(int i=0;i<obj.length;i++)
             System.out.println(obj[i]);

    }

}
