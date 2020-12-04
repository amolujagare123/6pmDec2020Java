public class SwitchDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 0;

        String option = "division";

        switch (option)
        {
            case "add" : c = a + b;
                System.out.println("Addition="+c);
                break;

            case "substract" : c = a - b;
                System.out.println("Substraction="+c);
                break;

            case "multiply" : c = a * b;
                System.out.println("Multiply="+c);
                break;

            case "division" : c = a / b;
                System.out.println("Division="+c);
                break;

        }

    }

}
