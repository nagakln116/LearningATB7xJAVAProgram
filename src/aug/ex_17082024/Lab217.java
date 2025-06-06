package aug.ex_17082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab217 {
    public static void main(String[] args) {
        try {
            int a = 10/0;   //Arithmetic Operation
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader file = new FileReader(new File("C://aalog.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
