package CollectionsDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("smita");
        ll.add("Tejashree");
        ll.add("komal");
        ll.add("Shashin");
        ll.add("amol");
        ll.add("valishali");

        System.out.println(ll);
        ll.set(2,"new element");


        ll.addFirst("FIRST");
        ll.addLast("LAST");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();



        System.out.println(ll);

    }

}
