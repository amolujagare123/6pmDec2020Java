package ExceprtionDemo;

public class ArrayExample {

    public static void main(String[] args) {

        int[] a = new int[5];

        System.out.println("length of array="+a.length);

        try {
            a[0] = 12;
            a[1] = 12;
            a[2] = 12;
            a[3] = 12;
            a[4] = 12;
            a[5] = 12;
        }
        catch (Exception e)
        {
            System.out.println("inside catch block");
            System.out.println("Msg:"+e.getMessage());
            System.out.println("Class:"+e.getClass());

        }

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("End of the program");
    }
}
