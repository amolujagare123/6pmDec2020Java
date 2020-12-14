package ClassesAndConstructors;

public class ClassDemo2 {
    int a;
    double d;
    char c ;
    String str; // data members

   /* ClassDemo2()
    {
        statements;
    }
*/

    ClassDemo2()
    {
        // no body
    }



    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo2 ob1 = new ClassDemo2();

        ob1.display();




    }



}
