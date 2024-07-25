package ex_14072024;

public class Lab071 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = s1;
        //1 value is stored in SCP
        System.out.println(s2);
        String s3 = s1.toLowerCase();
        //2 values are stored in SCP
        System.out.println(s3);
        System.out.println(s1);

    }
}
