package StaticDemos;

public class StaticMethodDemo {

    static int a =10 ;

    static void display()
    {
        System.out.println("a="+a);
    }

    static void myMethod()
    {
        a++;
        display();
    }

    void sampleMethod()
    {
        display(); // display is a static method
    }

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        ob.myMethod();

        StaticMethodDemo ob2 = new StaticMethodDemo();
        ob2.myMethod();


        myMethod(); // static

        //sampleMethod(); // non static method
    }

}
