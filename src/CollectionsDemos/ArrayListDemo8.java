package CollectionsDemos;

import java.util.ArrayList;

public class ArrayListDemo8 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('e');
        al.add('f');
        al.add('h');
        al.add('i');
        al.add('j');


        //Remove all the elements which are vowels

        System.out.println(al);

        al.removeIf(ch -> ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u');

        System.out.println(al);


    }
}
