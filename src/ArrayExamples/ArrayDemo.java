package ArrayExamples;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[6];

        a[0] = 56;
        a[1] = 16;
        a[2] = 46;
        a[3] = 51;
        a[4] = 54;
        a[5] = 6;

       int l =  a.length;
        System.out.println("length="+l);

        for(int i=0; i<6 ; i++)
            System.out.println(a[i]);

    }
}
