package Inheritance;

public class Animal1 {

    void eat()
    {
        System.out.println("eat");
    }
}

class Dog1 extends Animal1
{
    void bark()
    {
        System.out.println("bark");
    }

}

class Cat extends Animal1
{
   void meow()
   {
       System.out.println("Meow");
   }

    public static void main(String[] args) {

       Cat cat = new Cat();

       cat.meow();
       cat.eat();

       Dog1 d = new Dog1();
       d.bark();
       d.eat();



    }

}
