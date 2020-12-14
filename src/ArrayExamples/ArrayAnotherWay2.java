package ArrayExamples;

public class ArrayAnotherWay2 {

    public static void main(String[] args) {

        char[] a = {'v','f','o','#'};

        for(int i=0; i<a.length ; i++)
            System.out.print(a[i]+" ");

        System.out.println("\ndecmial values array");

        float f = 1.4f;
        double d = 1.4; // it has double the range of the float

        double[] dArray = {12.3,13.2,24.3,35.2,11.6,22.6};
        for (int i=0;i<dArray.length;i++)
            System.out.print(dArray[i]+" ");


    }
}
