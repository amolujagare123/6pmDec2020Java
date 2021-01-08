package CollectionsDemos;

import java.util.HashMap;

public class Student {
    int rno;
    String name;
    String college="ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("College="+college);
    }
    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        HashMap<Integer,Student> hm = new HashMap<>();

        hm.put(101,s1);
        hm.put(102,s2);
        hm.put(103,s3);

        hm.get(103).name = "amol";
        hm.get(103).college = "ITC";
        hm.get(103).rno = 12;


        s3.display();

        hm.get(103).display();


    }
}
