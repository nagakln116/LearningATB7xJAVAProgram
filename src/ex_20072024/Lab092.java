package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // Find the type of triangle based on the inputs on the length of sides
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side: ");
        float a = sc.nextFloat();
        System.out.println("Enter the length of second side: ");
        float b = sc.nextFloat();
        System.out.println("Enter the length of third side: ");
        float c = sc.nextFloat();

        if((a==b) && (a==c) && (b==c)) {
            System.out.println("This is an equilateral triangle");
        }
        else if ((a==b)&&(a==c)&&(a!=b)) {
            System.out.println("This is an isosceles triangle");
        }
        else if ((a!=b)&&(a==c)&&(a==b)) {
            System.out.println("This is an isosceles triangle");
        }
        else if ((a==b)&&(a!=c)&&(a==b)) {
            System.out.println("This is an isosceles triangle");
        }
        else{
            System.out.println("This is an Scalene");
        }
    }
}
