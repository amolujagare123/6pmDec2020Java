package AbstractionDemo;

public abstract class BaseClass {

    abstract void start();
    public abstract  void run();

    void display()
    {
        System.out.println("inside display");
    }
}

class DerivedClass extends BaseClass
{
    void start() // overriden method
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {
        DerivedClass ob = new DerivedClass();
        ob.start();

        BaseClass ob1 = new DerivedClass();

        ob1.display();

        }


}
