package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Find max in two given numbers and use else-if
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the 1st num: ");
        int first_num = sc.nextInt();

        System.out.printf("Enter the 2nd num: ");
        int second_num = sc.nextInt();

        System.out.println("1st num is : " + first_num);
        System.out.println("2nd num is : " + second_num);

        if (first_num > second_num) System.out.println("First num " + second_num + " is the max");
        else if (second_num > first_num) System.out.println("Second num " +  second_num + " is the max");
        else System.out.println("Both numbers are equal");

    }
}
