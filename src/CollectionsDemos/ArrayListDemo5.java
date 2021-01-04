package CollectionsDemos;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("smita");
        al.add("Tejashree");
        al.add("komal");
        al.add("Shashin");
        al.add("amol");
        al.add("valishali");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("komal");
        al2.add("Shashin");
        al2.add("amol");
        al2.add("komal1");
        al2.add("Shashin1");
        al2.add("amol1");

        System.out.println("al2="+al2);

        al2.removeAll(al);
        // it will remove - all the elements from al which are common in al2

        System.out.println("al2="+al2);
    }
}
