package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Determine a number is positive or negative or zero with a if condition
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0) System.out.println("Positive");
        else if (num<0) System.out.println("Negative");
        else System.out.println("Zero");


    }
}
