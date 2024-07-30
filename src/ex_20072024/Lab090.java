package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the score :");
        int score = sc.nextInt();

        if(score >=90 && score <=100) System.out.println("Grade is A");
        else if (score >=80 && score <89) System.out.println("Grade is B");
        else if (score >=70 && score <79) System.out.println("Grade is C");
        else if (score >=60 && score <69) System.out.println("Grade is D");
        else if (score < 0 || score >101) System.out.println("Are you god? Lol.");
        else System.out.println("Grade is F");
    }
}
