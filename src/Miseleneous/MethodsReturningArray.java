package Miseleneous;

public class MethodsReturningArray {

    int[] getMyArraySingle()
    {
        int[] a = {23,65,212,23,1,3,4,2,11};

        return  a;
    }

   // Homework methods returning array of --> double , character , string

    String[][] getMyStringTwoD()
    {
        String[][] stTwoD = {

                {"abc1","pqr1","xyz1","lmn1"},
                {"abc2","pqr2","xyz2","lmn2"},
                {"abc3","pqr3","xyz3","lmn3"},
                {"abc4","pqr4","xyz4","lmn4"}
        };

        return stTwoD;
    }



    public static void main(String[] args) {

        MethodsReturningArray ob = new MethodsReturningArray();

         int[] arr =  ob.getMyArraySingle();

        System.out.println(arr.length);

        /* for(int i=0;i<arr.length;i++)
             System.out.println(arr[i]);
*/

        System.out.println(ob.getMyArraySingle()[5] );


        System.out.println("=====2 d string array====");


        System.out.println(ob.getMyStringTwoD()[2][3]);
/*
        int row = ob.getMyStringTwoD().length;
        int col = ob.getMyStringTwoD()[0].length;*/

        // every method returning a value actually holds the value that it return
        // just like another variable

        ob.getMyStringTwoD();

        /*== {
        {

                {"abc1","pqr1","xyz1","lmn1"},
                {"abc2","pqr2","xyz2","lmn2"},
                {"abc3","pqr3","xyz3","lmn3"},
                {"abc4","pqr4","xyz4","lmn4"}

        }
        }*/

        // row count of the 2 d array

        int row = ob.getMyStringTwoD().length;
        int col = ob.getMyStringTwoD()[0].length;



        //String[][] starr = ob.getMyStringTwoD();

        //int rowStarr = starr.length;


        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++ )
            {
                System.out.print(ob.getMyStringTwoD()[i][j]+" ");
            }
            System.out.println();
        }

     String[][] myStr = ob.getMyStringTwoD();

     for(int i=0;i<myStr.length;i++)
     {
         for (int j=0; j<myStr[0].length;j++)
         {
             System.out.print(myStr[i][j]+" ");
         }
         System.out.println();
     }




    }
}
