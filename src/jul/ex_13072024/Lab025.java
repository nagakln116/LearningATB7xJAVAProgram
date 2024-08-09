package jul.ex_13072024;

import java.sql.SQLOutput;

public class Lab025 {
    public static void main(String[] args) {
        int a = 10;
        int b = 34;
        System.out.println(a+b); // + acts as a operator for addition for integer

        String s1 = "Pramod";
        String s2 = "Dutta";
        System.out.println(s1+s2); // + acts as a operator for concatenation for string

        String s3 = "Amit";
        int x = 12;
        int y = 13;
        System.out.println(s3+x+y); // + still acts as a operator for concatenation as there is a string in the start
        System.out.println(x+y+s3); // 1st + acts as for sum and 2nd + acts for concat
        System.out.println(x+y+s3+y+x+s3);
    }
}
