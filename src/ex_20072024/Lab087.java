package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //Take a number from user and define if its even or odd

        //Logic building
            //Figure out the inputs
            //Finalize data types required
            //Rough logic
            //Optimize

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if (user_input%2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}
