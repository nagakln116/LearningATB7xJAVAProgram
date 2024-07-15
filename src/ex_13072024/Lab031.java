package ex_13072024;

public class Lab031 {
    public static void main(String[] args) {
        final int A = 100; //final is the keyword for a constant; we cant change the value further
        System.out.println(A);
        //A++; //not possible and we hit this exception "java: cannot assign a value to final variable A"
        System.out.println(A);

        String name1 = "Naga";
        name1 = "Naga" + "Rajan";
        System.out.println(name1);
        final String name = "Naga";
        System.out.println(name);
        //name = "Naga"+"Rajan"; //not allowed as Java will throw "java: cannot assign a value to final variable name" in compilation
        System.out.println(name);
    }
}
