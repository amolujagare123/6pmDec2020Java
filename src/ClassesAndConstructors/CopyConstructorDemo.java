package ClassesAndConstructors;

public class CopyConstructorDemo {
    int a;
    double d;
    char c ;
    String str; // data members

    CopyConstructorDemo()
    {

    }

    // copy constructor

    CopyConstructorDemo(CopyConstructorDemo obj)
    {
        a = obj.a;
        d = obj.d;
        c = obj.c;
        str = obj.str;

        obj.display();
    }


    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        CopyConstructorDemo ob1 = new CopyConstructorDemo();

        ob1.a = 10 ;
        ob1.d = 56.56;
        ob1.c = 'c';
        ob1.str="amol";

        ob1.display();

        CopyConstructorDemo ob2 = new CopyConstructorDemo(ob1);

        ob2.display();



    }



}
