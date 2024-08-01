package ex_21072024;

public class Lab133 {
    public static void main(String[] args) {
        //Fizzbuzz problem
        //write a program which prints 1 to 100
        //Print Fizz for multiples of 3, buzz for multiples of 5 and Fizzbuzz for multiples of 3&5

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    }

