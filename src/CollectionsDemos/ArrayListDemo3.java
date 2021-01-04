package CollectionsDemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("smita");
        al.add("Tejashree");
        al.add("komal");
        al.add("Shashin");
        al.add("amol");
        al.add("valishali");

        System.out.println(al);
        al.set(2,"new Element");

        System.out.println(al);

        al.remove(3);

        al.remove("amol");

        System.out.println(al);


        System.out.println(al.get(0));

    }
}
