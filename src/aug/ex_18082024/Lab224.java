package aug.ex_18082024;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0) {
            try {
                throw new Exception("0 is not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            int a = 10 / x;
            System.out.println(a);
        }
    }
}
