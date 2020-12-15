package pack1;

public class Java2 {

    int a2;
    double d2;
    char c2;
    String str2;


    void display2()
    {
        System.out.println("a=" + a2);
        System.out.println("d=" + d2);
        System.out.println("c=" + c2);
        System.out.println("str=" + str2);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a1 =10;
        ob.d1 = 3.4;
      //  ob.c1 ='g';
        ob.display1();

    }

}
