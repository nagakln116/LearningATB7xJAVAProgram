package ex_27072024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        //Take inputs from user for the marks of 5 subjects and find the average
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the mark of the subject " + i+1);
            marks[i] = sc.nextInt();
        }
        float sum = 0.0f;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println("Avesrage of all 5 marks is "+sum/ marks.length);
        sc.close();
    }
}
