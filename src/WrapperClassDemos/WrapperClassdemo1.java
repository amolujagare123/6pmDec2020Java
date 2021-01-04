package WrapperClassDemos;

public class WrapperClassdemo1 {

    public static void main(String[] args) {

        int i =5;
        Integer ii = new Integer(i); // boxing /wrapping

        System.out.println("ii="+ii);

        int a =10;

        Integer ii1 = 10; // autoboxing /auto wrapping
        System.out.println("ii1="+ii1);

        Integer ii2 = a;
        System.out.println("ii2="+ii2);


        Integer aa1 = new Integer(4);

        int x = aa1.intValue(); // unboxing /unwrapping
        System.out.println("x="+x);

        int y = aa1; // autounboxing /autounwrapping
        System.out.println("y="+y);


    }
}
