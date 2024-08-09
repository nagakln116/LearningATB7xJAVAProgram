package jul.ex_20072024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        //Take an input char from user and identify if it is a vowel
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the character :");
        char user_input = sc.next().charAt(0);
        switch (user_input){
            case 'a': System.out.println("vowel");
            break;
            case 'e': System.out.println("vowel");
            break;
            case 'i': System.out.println("vowel");
            break;
            case 'o': System.out.println("vowel");
            break;
            case 'u': System.out.println("vowel");
            break;
            default: System.out.println("not a vowel");
        }

    }
}
