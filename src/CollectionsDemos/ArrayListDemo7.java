package CollectionsDemos;

import java.util.ArrayList;

public class ArrayListDemo7 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(43);
        al.add(53);
        al.add(63);
        al.add(33);
        al.add(3);

        //Remove all the elements whicha re less than 50

        /*String str = "smita";
        str.contains("m")*/

        System.out.println(al);

         al.removeIf( a -> a<50);



        System.out.println(al);

        System.out.println(al.get(1));
    }
}
