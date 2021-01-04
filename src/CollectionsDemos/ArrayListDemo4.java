package CollectionsDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

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
        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);

    }
}
