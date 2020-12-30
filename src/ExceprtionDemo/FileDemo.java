package ExceprtionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fp = new FileInputStream("D:\\pallavi\\screenshot1.png");

        System.out.println("End of the program");

    }
}
