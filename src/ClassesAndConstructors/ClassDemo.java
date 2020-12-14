package ClassesAndConstructors;

public class ClassDemo {
    int a;
    double d;
    char c ;
    String str; // data members


    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo ob1 = new ClassDemo();

        ob1.a = 10 ;
        ob1.d = 56.56;
        ob1.c = 'c';
        ob1.str="amol";
        ob1.display();

        ClassDemo ob2 = new ClassDemo();
        ob2.a = 11;
        ob2.d= 11.1;
        ob2.c = 'a';
        ob2.str="smita";
        ob2.display();



    }



}
