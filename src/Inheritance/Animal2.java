package Inheritance;

public class Animal2 {

    void iamAnimal()
    {
        System.out.println("I am animal");
    }
}

class Mamal extends Animal2{

    void iamMamal()
    {
        System.out.println("I am Mamal");
    }
}

class Reptile extends Animal2
{
        void iamReptile()
        {
            System.out.println("I am Reptile");
        }
    }

class Tiger extends Mamal
{
    void iamTiger()
    {
        System.out.println("I am Tiger");
    }
}

class Testinheritance
{
    public static void main(String[] args) {

        Animal2 a = new Animal2();
        a.iamAnimal();

        Mamal m = new Mamal();
        m.iamMamal();
        m.iamAnimal();

        Reptile r = new Reptile();
        r.iamReptile();
        r.iamAnimal();

        Tiger t = new Tiger();
        t.iamTiger();
        t.iamMamal();
        t.iamAnimal();


    }


}