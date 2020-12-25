package AbstractionDemo;

public interface MyInterface {

    void run(); // public
    void start();

    default void display()
    {
        System.out.println("interface display");
    }

    static void myMethod() // this method is public
    {
        System.out.println("interface myMethod");
    }

}

class  ChildInterface implements   MyInterface
{

    public void start() // overriden method
    {
        System.out.println("start");
    }

   public void run() {
       System.out.println("run");
   }

    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();

        ob.run();
        ob.start();

        ob.display();

        MyInterface.myMethod();
        AnotherInterface.myMethod();

        // interface static methods can be called
        // using interface name only


    }
}
