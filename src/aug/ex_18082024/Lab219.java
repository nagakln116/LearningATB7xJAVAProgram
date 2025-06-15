package aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219 {
    public static void main(String[] args)  {
        try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("smaller basket");
        } catch (Exception e) {
            System.out.println("bigger basket");
        }
        System.out.println("Program continues");
    }
}
