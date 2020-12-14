package ClassesAndConstructors;

public class ParameterizedWithThisOp {
    int a;
    double d;
    char c ;
    String str; // data members

// in order to bring ease into the coding we prefer the same name in
    // the parameteized constructors
    // variables with this operators will be data members of the class

    ParameterizedWithThisOp(int a , double d, char c, String str )
    {
        this.a = a;
        this.d =d;
        this.c =c;
        this.str = str;
    }


    void display() // member function / method
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedWithThisOp ob1 = new ParameterizedWithThisOp(5, 3.4, 'd',"tejshree");

        ob1.display();

        System.out.println("\nob2 object below");

        ParameterizedWithThisOp ob2 = new ParameterizedWithThisOp(10,7.5,'s',"Komal");

        ob2.display();




    }



}
