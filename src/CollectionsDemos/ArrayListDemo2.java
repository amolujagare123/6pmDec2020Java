package CollectionsDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("smita");
        al.add("Tejashree");
        al.add("komal");
        al.add("Shashin");
        al.add("amol");
        al.add("valishali");

       System.out.println(al);

        Collections.sort(al);

        System.out.println(al);


     /*  al.clear();

        System.out.println(al);
*/

    }
}
