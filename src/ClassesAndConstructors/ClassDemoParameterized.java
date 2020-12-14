package ClassesAndConstructors;

public class ClassDemoParameterized {
    int a;
    double d;
    char c ;
    String str; // data members


    ClassDemoParameterized(int x ,double d1, char c1, String s )
    {
        a = x;
        d =d1;
        c =c1;
        str = s;
    }

    ClassDemoParameterized()
    {

    }

    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemoParameterized ob1 = new ClassDemoParameterized(5, 3.4, 'd',"tejshree");

        ob1.display();

        System.out.println("\nob2 object below");

        ClassDemoParameterized ob2 = new ClassDemoParameterized();

        ob2.display();




    }



}
