package jul.ex_21072024;

import javax.swing.text.html.parser.Entity;
import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {
        //Leap year program
        // Enter a year and determine whether it is leap year or not
        //Condition for lead year is the year should be divisible by 4 and if the year is a century then it should be divisible by 400

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        long year = sc.nextLong();

        if (year % 100 == 0) {
            if (year % 400 == 0) System.out.println("Yes, " + year + " is a leap year");
            else System.out.println("Nope, " + year + " is not a leap year");
        }
        else if (year % 4 == 0) System.out.println("Yes, " + year + " is a leap year");
        else System.out.println("Nope, " + year + " is not a leap year");
    }
}
