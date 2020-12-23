package StaticDemos;

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

        Student st1 = new Student();
        st1.rno = 1;
        st1.name="Smita";
        st1.display(); // college = ? ITS

        Student st2 = new Student();
        st2.rno = 2;
        st2.name="Komal";
        st2.college="PICT";
        st2.display(); // college = ? PICT

        Student st3 = new Student();
        st3.rno = 3;
        st3.name="Shashin";
        st3.display(); // college = ? ITC

    }
}
