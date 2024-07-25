package ex_14072024;

public class Lab073 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Guys";
        String s3 = "HelloGuys";
        // 3 strings stored in SCP
        String s4 = s1.concat(s2);
        // 4 strings stored in SCP, even though s3 and s4 are same value
        System.out.println(s4);

    }
}
