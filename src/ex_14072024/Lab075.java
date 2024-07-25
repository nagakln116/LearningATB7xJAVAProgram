package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Naga");
        String s2 = new String("Naga");
        String s3 = new String("Naga");
        System.out.println(s1==s2); //false; different reference
        System.out.println(s1==s3); //false; different reference
        System.out.println(s2==s3); //false; different reference
        System.out.println(s1.equals(s2)); //true; content is same
        System.out.println(s1.equals(s3)); //true; content is same
        System.out.println(s2.equals(s3)); //true; content is same
    }
}
