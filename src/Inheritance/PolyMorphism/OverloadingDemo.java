package Inheritance.PolyMorphism;

public class OverloadingDemo {

    void addition() {
        int a = 10;
        int b = 20;
        int add = 0;
        add = a + b;
        System.out.println("Addition=" + add);
    }
    void addition(int a, int b)
    {
        int add = 0;
        add = a + b;
        System.out.println("Addition=" + add);
    }
    void addition(int a, int b, int c)
    {
        int add = 0;
        add = a + b + c;
        System.out.println("Addition=" + add);
    }

    void addition(double a, double b, String str)
    {
        double add = 0;
        add = a + b;
        System.out.println("Addition=" + add);
    }

    void addition(String a, String b)
    {
        String add = "";
        add = a + b;
        System.out.println("Addition=" + add);
    }

    public static void main(String[] args) {

        OverloadingDemo ob = new OverloadingDemo();

        ob.addition();
        ob.addition(12,13);
        ob.addition(1,1,1);
       ob.addition(12.2,11.1,"asb");
        ob.addition("amol","ujagare");

        /*String str = "abcd";

        str.substring(1);
        str.substring(2,4);*/

    }
}