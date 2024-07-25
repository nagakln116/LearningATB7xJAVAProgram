package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        // 2 values created in HEAP, instead of reusing s1
        String s3 = s1;
        //Now s1 is reused; no new value is created as there is no new operator.
    }
}
