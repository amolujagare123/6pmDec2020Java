package Inheritance.SuperDemo;

public class Animal2 {
   void eat()
   {
       System.out.println("all animal eat");
   }
}

class  Dog2 extends Animal2 {

    void eat() {
        System.out.println("Dog is eating");
    }


    void bark() {
        System.out.println("dog bark");
    }

    void work() {
        eat();
        bark();
        super.eat();
    }

    public static void main(String[] args) {

        Dog2 ob = new Dog2();

        ob.work();

    }
}