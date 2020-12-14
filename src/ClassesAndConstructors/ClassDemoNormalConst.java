package ClassesAndConstructors;

public class ClassDemoNormalConst {
    int a;
    double d;
    char c ;
    String str; // data members


    ClassDemoNormalConst()
    {
        a = 10;
        d =11.2;
        c ='c';
        str = "shashin";
    }



    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemoNormalConst ob1 = new ClassDemoNormalConst();

        ob1.display();

        System.out.println("\nob2 object below");

        ClassDemoNormalConst ob2 = new ClassDemoNormalConst();

        ob2.display();




    }



}
