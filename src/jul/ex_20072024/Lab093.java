package jul.ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        //Switch condition is used verify multiple conditions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the weekday: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter number only between 1-7");
        }
    }
}
