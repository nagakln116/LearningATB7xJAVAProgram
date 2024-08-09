package jul.ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //Take input from a use and find Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int a = 1;
        while (n>=1){
            a = a * n;
            n--;
        }
        System.out.println(a + " is the factorial of " + n);
    }
}
