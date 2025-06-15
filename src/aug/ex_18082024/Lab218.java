package aug.ex_18082024;

import java.sql.SQLOutput;

public class Lab218 {
    public static void main(String[] args) {
        extracted();
        System.out.println("Rest of the lines in the method keeps running");
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer [] i = new Integer[2];
            System.out.println(i[3]); //Unchecked exception
        } catch (Exception e) {
            System.out.println("Array Index Out of bound");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of Program");
        }
    }
}
