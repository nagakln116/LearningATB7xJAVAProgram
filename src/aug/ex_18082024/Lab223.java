package aug.ex_18082024;

import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) {
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("Pramod")){
            try {
                throw new Exception("This name not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            }
        else {
            System.out.println("Allowed");
        }
    }
}
