package StaticDemos;


//import static StaticDemos.StaticMethodDemo.display;

public class Counter {

    static int count =0 ; // 1

    Counter()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter ob1 = new Counter(); // 1
        Counter ob2 = new Counter(); // 2
        Counter ob3 = new Counter(); // 3

        StaticMethodDemo.display();

    }

}
