package Miseleneous;

import java.util.Date;

public class ReturningValue {

    int myMethodInt()
    {
        int a = 67;
        String str = "Smita";

        return a;
    }

    char myChar()
    {
        char c = 't';

        return  c;
    }

    boolean myBoolean()
    {
        return  false;
    }

    String myString()
    {
        String str = "abcdefg";
        return  str;
    }

    Date myDate()
    {
        return  new  Date();
    }


    public static void main(String[] args) {

        ReturningValue ob = new ReturningValue();
        //Whenever a method returns a value
        // : it actually holds the value that it returns
        //just like another variable
        ob.myMethodInt(); // a-> 67

        int x = 20 ; // x holds a value '20'

        int y = ob.myMethodInt();
        System.out.println(y); // 67
        System.out.println(ob.myMethodInt()); // 67


        char ch = ob.myChar();

        System.out.println("ch="+ch);

        System.out.println(ob.myBoolean());

        System.out.println(ob.myString());

        System.out.println(ob.myDate());

    }
}
