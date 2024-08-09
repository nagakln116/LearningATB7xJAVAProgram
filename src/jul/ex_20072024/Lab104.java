package jul.ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.printf("Enter 2nd num: ");
        int b = sc.nextInt();
        System.out.printf("Enter 3rd num: ");
        int c = sc.nextInt();
        if(a>b && a>c) System.out.println(a+ " is the max");
        else if (b>a && b>c) System.out.println(b + " is the max");
        else System.out.println(c + "is the max");


    }
}
