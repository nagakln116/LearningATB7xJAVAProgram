package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //write a program to get user input for name, age and salary
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = sc.next();

        System.out.printf("Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.println("Your details are here below");
        System.out.println("You are " + name + ", " + age + "years old and getting paid an amount of " + salary);

        sc.close();

    }
}
