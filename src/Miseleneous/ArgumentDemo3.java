package Miseleneous;

import Inheritance.Employee;
import pack1.Java1;

public class ArgumentDemo3 {

    void getMyArray(int[] a)
    {
       for(int i=0;i<a.length;i++)
           System.out.print(a[i]+" ");

    }

    void  getTwoDArray(String[][] sArr)
    {
        int row = sArr.length;
        int col = sArr[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sArr[i][j]+"\t");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        ArgumentDemo3 ob = new ArgumentDemo3();

        int[] x = {34,23,12,12,11,2,6,90,11};

        ob.getMyArray(x);

        System.out.println();


        String[][] s = {
                {"abc1","pqr1","xyz1","sss1"},
                {"abc2","pqr2","xyz2","sss2"},
                {"abc3","pqr3","xyz3","sss3"},
                {"abc4","pqr4","xyz4","sss4"}
        };

        ob.getTwoDArray(s);

    }


}
