package AbstractionDemo;

public interface MyInterface1 {
    void run(); // public
    void start();
    void display();

    static void myMethod() // this method is public
    {
        System.out.println("interface myMethod");
    }


}

interface  AnotherInterface
{
    void display();

    static void myMethod() // this method is public
    {
        System.out.println("Another interface myMethod");
    }

}


class MyClass
{
    void myMethod2()
    {
        System.out.println("interface another Method");

    }

}



class  ChildInterface1 extends MyClass implements   MyInterface1,AnotherInterface
{

    public void start() // overriden method
    {
        System.out.println("start");
    }

    public void run() {
        System.out.println("run");
    }

    public void display()
    {
        System.out.println("inside display");
    }

    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();

        ob.run();
        ob.start();

        ob.display();

        MyInterface.myMethod();

        // interface static methods can be called
        // using interface name only

        MyClass ob2 = new MyClass();
        ob2.myMethod2();

        ChildInterface1 ob3 = new ChildInterface1();
        ob3.myMethod2();


    }
}
