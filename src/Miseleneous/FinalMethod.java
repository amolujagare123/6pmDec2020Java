package Miseleneous;

public class FinalMethod {

    final void display()
    {
        System.out.println("display from final method");
    }
}

class ChildFinal extends  FinalMethod
{

  /*  void display() // we cant override it
    {
        System.out.println("display from ChildFinal method");
    }*/
}