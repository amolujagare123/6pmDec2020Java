package WrapperClassDemos;

public class WrapperClassdemo2 {

    public static void main(String[] args) {

        String str1 = "111";
        String str2 = "222";

        System.out.println(str1+str2); // 111222 / 333

        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);

        System.out.println(a1+a2);

        String str3 = "12.3";
        String str4 = "1.31";
        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        System.out.println(d1+d2);

        // int , double , float , boolean

        String str5 = "true";
        String str6 = "false";

      //  System.out.println(str5 || str6);

        boolean b1 = Boolean.parseBoolean(str5);
        boolean b2 = Boolean.parseBoolean(str6);

        System.out.println(b1 || b2); // true

        System.out.println(b1 && b2); // false


        String str7 = "d"; // 'd'
        char ch = str7.charAt(0);
        System.out.println("ch="+ch);




    }
}
