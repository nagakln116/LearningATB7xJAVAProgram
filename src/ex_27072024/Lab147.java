package ex_27072024;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        //Find the max value in an array
        //This is an interview question
        int [] salary = {3,5,7,9,21,19,17,101};
        int max = salary[0];
        for (int i = 0; i < salary.length-1; i++) {
            if (max > salary[i + 1]) {
                continue;
            } else max = salary[i + 1];
        }
        System.out.println(max + " is the maximum of the salary");

        //another method
        Arrays.sort(salary);
        System.out.println(salary[salary.length - 1] + " is the maximum salary");

    }
}
