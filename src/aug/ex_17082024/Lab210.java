package aug.ex_17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
        // Exception

        //Checked - Compile time
//        try {
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //UnChecked - Runtime
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            //throw new RuntimeException("Error div by 0");
            e.printStackTrace();
        }
        System.out.println("Program continued-----------"); //As the exception is handled, this line will be printed
    }
}
