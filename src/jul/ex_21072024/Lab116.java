package jul.ex_21072024;

public class Lab116 {
    public static void main(String[] args) {
        int i = 0 ;
        boolean b = true;
        for (; b; i++)
        {
            System.out.println(i);
            b = i < 10;
        }
    }
}
