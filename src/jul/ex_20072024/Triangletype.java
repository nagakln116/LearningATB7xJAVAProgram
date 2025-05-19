package jul.ex_20072024;

import java.util.Scanner;

public class Triangletype {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st side in float: ");
        float sideA = sc.nextFloat();
        System.out.println("Enter the length of 2nd side in float: ");
        float sideB = sc.nextFloat();
        System.out.println("Enter the length of 3rd side in float: ");
        float sideC = sc.nextFloat();
        if ((sideA == sideB) && (sideA == sideC)) System.out.println("This is an equilateral triangle");
        else if ((sideA ==sideB) && (sideA != sideC)) System.out.println("This is an isosceles triangle");
        else if ((sideA != sideB) && (sideA == sideC)) System.out.println("This is an isosceles triangle");
        else System.out.println("This is a Scalene triangle");
    }
}
