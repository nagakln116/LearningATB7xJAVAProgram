package ex_27072024;

public class Lab139 {
    public static void main(String[] args) {
        //another way to create an array
        int[] mark = new int[5];
        // this way we have declared an array but not initialized the values
        // by default the values will be 0 for each int elements of the array
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);

        mark[0] = 100;
        mark[1] = 90;
        mark[2] = 80;
        mark[3] = 90;
        mark[4] = 90;

        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        //System.out.println(mark[5]); // we will get an exception as Arry index out of bound for length 5

        //We can create an boolean array as well

        boolean[] is_married = {true, false, false};
        System.out.println(is_married[0]);
        System.out.println(is_married[1]);
        System.out.println(is_married[2]);

        //we can also traverse an array as below using a for loop

        for (int i = 0; i < is_married.length; i++) {
            System.out.println(is_married[i]);
        }

        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }

        String[] weekdays = new String[5];
        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";

        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }

    }
}
