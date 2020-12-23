package Miseleneous;

import pack1.Java1;

public class ReturningObject {

    Java1 getMyObject()
    {
        Java1 obj = new Java1();

        obj.d1 = 13.4;
        obj.a1 =12;
        obj.str1 = "java1";

        return  obj;

    }
    public static void main(String[] args) {

        ReturningObject ob = new ReturningObject();

        Java1  object1 = new Java1(); // using normal way

        object1.display1();

        Java1  object2 = ob.getMyObject();
        object2.display1();

        System.out.println("using direct method of getMyObject");

        ob.getMyObject().display1();
    }
}
