package jul.ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the 1st num: ");
        int age = sc.nextInt();
        if (age > 18) System.out.println("Allowed to Goa");
        else System.out.println("Not allowed anywhere");
    }
}
