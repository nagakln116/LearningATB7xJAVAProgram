package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        //implicit type casting
        byte b = 10;
        int a = b; //This is allowed as value from smaller container is stored in a bigger container
        int a1 = (int) b; //As this is implicit casting the (int) has no effect at all
        System.out.println(a);
        System.out.println(a1);
        short s = b; //This is allowed as value from smaller container is stored in a bigger container
        System.out.println(s);
        long l = b; //This is allowed as value from smaller container is stored in a bigger container
        System.out.println(l);

        //Narrowing
        //Explicit type casting when larger to smaller container
        int val = 300;
        //byte b1 = val; //Narrowing ==> java: incompatible types: possible lossy conversion from int to byte
        byte b1 = (byte) val; //Explicit type casting. Without typecasting this is not allowed.
        System.out.println(b1);


    }
}
