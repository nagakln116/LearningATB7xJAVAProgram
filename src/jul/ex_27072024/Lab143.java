package jul.ex_27072024;

public class Lab143 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        //Disadvantage of an array
        //1. fixed data type
        //2. fixed length

        int [] ages = new int[100];
        ages[1] = 45;
        System.out.println(ages[1]);
        // only one element is initialized; rest of the memory are allocated but not used
    }

}
