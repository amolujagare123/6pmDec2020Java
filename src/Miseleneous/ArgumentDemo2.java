package Miseleneous;

import Inheritance.Employee;
import pack1.Java1;

public class ArgumentDemo2 {

    void getMyObject(Java1 object)
    {
        object.a1 = 12;
        object.d1 =12.4;
        object.str1 ="amol";

    }

    void setEmpObject(Employee emp)
    {
        emp.salary = 0;
    }

    public static void main(String[] args) {

        ArgumentDemo2 ob = new ArgumentDemo2();

        Java1 j1 = new Java1();
        System.out.println("--------Before method call----------");
        j1.display1();

        ob.getMyObject(j1);

        System.out.println("--------After method call----------");
        j1.display1();

        Employee e = new Employee();
        System.out.println("--------Before method call----------");
        System.out.println("Salary="+e.salary);

        ob.setEmpObject(e);

        System.out.println("--------After method call----------");
        System.out.println("Salary="+e.salary);

    }


}
