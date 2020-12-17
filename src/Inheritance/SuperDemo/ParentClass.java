package Inheritance.SuperDemo;

public class ParentClass {

       ParentClass()
       {
           System.out.println("Parent class constructor");
       }

}

class ChildClass extends ParentClass
{

    ChildClass()
    {
     //   super(); // it gives call to the parent class constructor
        System.out.println("Child Class constructor");
    }

    public static void main(String[] args) {

        ChildClass ob = new ChildClass();

    }

}
