public class ForLoopDemo5 {

    public static void main(String[] args)
    {
        for (int i=1;i<=30; i++)
        {
            if(i%3==0 && i%5==0)
                System.out.println(i+ " FizzBuzz");
            else
            if (i%5==0)
                System.out.println(i+ " Buzz");
            else
            if (i%3==0) // 15
                System.out.println(i+" fizz");
            else
                System.out.println(i);
        }
    }

}
