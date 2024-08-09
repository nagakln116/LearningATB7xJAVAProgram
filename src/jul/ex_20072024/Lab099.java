package jul.ex_20072024;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        //Break statement is replaced by ->
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the character :");
        char user_input = sc.next().charAt(0);
        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
            default -> System.out.println("not a vowel");
        }
    }
}