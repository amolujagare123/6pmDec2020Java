package ArrayExamples;

public class TwoDimentionalArray {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 34;
        a[0][1] = 36;
        a[0][2] = 26;

        a[1][0] = 14;
        a[1][1] = 16;
        a[1][2] = 56;

        a[2][0] = 31;
        a[2][1] = 32;
        a[2][2] = 21;

        a[3][0] = 36;
        a[3][1] = 31;
        a[3][2] = 76;

        int row  = a.length; // 4
        int col = a[0].length; // 3

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<a.length;i++) // rows---0
        {
            for (int j=0;j<a[0].length;j++) // col--- 0 --> 0 ,1,2
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
