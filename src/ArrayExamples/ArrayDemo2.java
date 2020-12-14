package ArrayExamples;

public class ArrayDemo2 {

    public static void main(String[] args) {

        char[] a = new char[6];

        a[0] = 'a';
        a[1] = 's';
        a[2] = 'd';
        a[3] = 'f';
        a[4] = 'g';
        a[5] = 'h';

       /* int l =  a.length;
        System.out.println("length="+l);*/

        for(int i=0; i<a.length ; i++)
            System.out.println(a[i]);

    }
}
