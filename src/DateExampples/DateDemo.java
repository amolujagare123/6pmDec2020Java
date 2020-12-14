package DateExampples;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        // coverting date into string -- > use format method

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);



        System.out.println(dateStr);


    }
}
