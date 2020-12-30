package ExceprtionDemo;

public class ThrowDemo {

    void getNumber(int i) throws Exception // i in between 1 to 10 or not
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else
        {
            System.out.println("Something is wrong");

          /*  Exception e = new Exception("msg");

            ArithmeticException ar= new ArithmeticException("arithmetic");*/

            Exception e = new Exception("msg");

            throw e;

        }

    }

    public static void main(String[] args) throws Exception {

        ThrowDemo ob = new ThrowDemo();

        int a = 110 ;
        System.out.println("number="+a);

        ob.getNumber(a);

        System.out.println("End of the program");
    }

}
