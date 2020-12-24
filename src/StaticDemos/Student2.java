package StaticDemos;

public class Student2 {
    int rno;
    String name;
    static String college="ITS";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("College="+college);
    }

    static void printCollege()
    {
        System.out.println("College="+college);
    }

    public static void main(String[] args) {

        System.out.println("college using className="+Student2.college); // ITS

        Student2 st1 = new Student2();
        st1.rno = 1;
        st1.name="Smita";

        Student2 st2 = new Student2();
        st2.rno = 2;
        st2.name="Komal";
        st2.college="PICT";

        Student2.college ="Sinhgad";

        Student2 st3 = new Student2();
        st3.rno = 3;
        st3.name="Shashin";


        st1.display();  // PICT
        st2.display(); // PICT
        st3.display(); // PICT
        System.out.println("college using className="+Student2.college); // PICT

        st2.printCollege();

        Student2.printCollege(); // using class name

    }
}
