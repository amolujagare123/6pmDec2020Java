package pack2;

import pack1.Java1;

public class Java3 extends Java1{

    int a3;
    double d3;
    char c3;
    String str3;


    void display3()
    {
        System.out.println("a=" + a3);
        System.out.println("d=" + d3);
        System.out.println("c=" + c3);
        System.out.println("str=" + str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a1 =90;
        ob.d1 =3.4;
      //  ob.c1='v';
     //   ob.str1="sds";


        Java3 j3 = new Java3();

        j3.a1 =10;
        j3.d1=90.56;
        j3.c1='k';
        //j3.str1="amol";

    }

}
