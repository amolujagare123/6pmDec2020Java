package Miseleneous;

public class FinalVariableDemo {

    final int speed =100;
    // we cant change its value
    void change()
    {
        //speed =200;
    }

    public static void main(String[] args) {

        FinalVariableDemo ob = new FinalVariableDemo();
        System.out.println(ob.speed);
        ob.change();
        System.out.println(ob.speed);
    }
}
