package CollectionsDemos;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("smita");
        al.add("Tejashree");
        al.add("komal");
        al.add("Shashin");
        al.add("amol");
        al.add("valishali");

       //Remove all the elements with contains 'm'

        /*String str = "smita";
        str.contains("m")*/

        System.out.println(al);

        al.removeIf( str1 -> str1.contains("m") );


        System.out.println(al);
    }
}
