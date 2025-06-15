package aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221 {
    public static void main(String[] args) throws FileNotFoundException {
        int a = 10/0; //Unchecked exception
        FileReader f = new FileReader(new File("c://a.txt")); //Checked exception

    }
}
