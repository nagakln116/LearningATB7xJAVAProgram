package jul.ex_27072024;

public class Lab141 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[2] = 90;
        System.out.println(a[1]); // it will be 0 as the value is not initialized yet
    }
}
