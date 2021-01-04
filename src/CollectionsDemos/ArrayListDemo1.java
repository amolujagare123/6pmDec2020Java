package CollectionsDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        System.out.println("Size="+al.size());
        System.out.println(al.isEmpty()); // true

        al.add("smita");
        al.add("Tejashree");
        al.add("komal");
        al.add("Shashin");
        al.add("amol");
        al.add("valishali");
        al.add(12);
        al.add(1.2);
        al.add('g');
        al.add(true);

        System.out.println(al.isEmpty());// false

       System.out.println(al);
        System.out.println("Size="+al.size());

        System.out.println("Using for loop");

        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("Using for Iterator");

        Iterator itr = al.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }


    }
}
