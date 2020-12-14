package StringDemos;

public class StringpatternDemo {

    public static void main(String[] args) {

        String str = "AMOL";

        for (int i=0;i<str.length();i++)
            System.out.println(str.substring(i)+str.substring(0,i));


    }
}
