package Inheritance;

public class Employee {
   public int salary = 10000;

}

class Programmer extends Employee
{

    int bonus = 2000;

    public static void main(String[] args) {

        Programmer ob = new Programmer();
        System.out.println(ob.bonus);
        System.out.println(ob.salary);

    }
}
