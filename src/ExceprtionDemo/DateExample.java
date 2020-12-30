package ExceprtionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12/03/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(dateStr);

        System.out.println("End of the program");

    }
}
