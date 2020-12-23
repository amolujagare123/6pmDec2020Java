package Miseleneous;

final public class FinalClass {

int a =10 ;


}


class  ChildFinalClass //extends  FinalClass
{
//we cant subclass it (we cant make it as anyones parent / FinalClass)

    public static void main(String[] args) {

        FinalClass ob = new FinalClass();

        System.out.println(ob.a);


    }


}
