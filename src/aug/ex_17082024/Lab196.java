package aug.ex_17082024;

public class Lab196 {
    public static void main(String[] args) {
        //convert primitive to wrapper class
        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b.toString()); //lot of utilities (inbuilt functions) are added as b belongs to wrapper class
        System.out.println(Integer.MAX_VALUE); //Max value is an attribute of integer class

        //convert wrapper class to primitive
        Integer a2 = 11;
        int b2 = a2;
        System.out.println(a2.doubleValue());
        System.out.println(b2); //none of the utilities work as b2 is a primitive
    }
}
