package aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Program starts");
        read();
        }

    private static void read() throws FileNotFoundException {
        System.out.println("Hello in read method");
        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        System.out.println("Program continues inside the method");
    }
}
