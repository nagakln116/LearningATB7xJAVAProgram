package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String s1 = "The testing Academy";
        String s2 = "The testing Academy";
        // one value stored in SCP because SCP stores one unique value
        String s3 = new String("The testing Academy");
        String s4 = new String("The testing Academy");
        //two values stored in HEAP because the new operator creates allocates new memory everytime
        System.out.println(s1==s2); // true; checks for reference
        System.out.println(s3==s4); // false; checks for reference
        System.out.println(s1==s3); // false; checks for reference

        System.out.println(s1.equals(s2)); //true; checks for values
        System.out.println(s3.equals(s4)); //true; checks for values
        System.out.println(s1.equals(s3)); //true; checks for values


    }
}
