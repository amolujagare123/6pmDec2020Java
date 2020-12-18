package Miseleneous;

import pack1.Java1;

import java.util.Date;

public class Arguments {

    void getMyInt(int a)
    {
        System.out.println("int a="+a);
    }
    void getMyDouble(Double d)
    {
        System.out.println("Double d="+d);
    }

    void getMyChar(char c)
    {
        System.out.println("Char c="+c);
    }

    void getMyBoolean(boolean b)
    {
        System.out.println("Bolean b="+b);
    }
    void getMyValues(boolean b, char c)
    {
        System.out.println("Bolean b="+b);
        System.out.println("Char c="+c);

    }

    void getMyString(String str)
    {
        System.out.println("String str="+str);
    }

    void getMyDate(Date date)
    {
        System.out.println("Date date="+date);
    }

    void getMyObject(Java1 object)
    {
        object.a1 = 10;
        object.str1="aaa";
        object.d1 =13.4;
      //  object.display1();
    }


    public static void main(String[] args) {
        Arguments ob = new Arguments();
        int x = 18;
        ob.getMyInt(x);
        ob.getMyChar('h');
        ob.getMyDouble(1.2);
        ob.getMyBoolean(true);
        ob.getMyValues(false,'f');
        ob.getMyString("amol");

        ob.getMyDate(new Date());

        Date date = new Date();

        ob.getMyDate(date);
   //-----------------------------------------------
        System.out.println("------------------");

        Java1 j1 = new Java1();

        j1.display1();

       ob.getMyObject(j1);
        System.out.println("--------After method call----------");

        j1.display1();

    }

}
