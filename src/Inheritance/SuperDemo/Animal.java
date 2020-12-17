package Inheritance.SuperDemo;

public class Animal {

    String color = "white";

}

class  Dog extends Animal
{
    String color = "black";

    void printColor()
    {
        System.out.println("Dog:" + color);
        System.out.println("Animal:" + super.color);

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();


    }

}
