package aug.ex_17082024;

public class Lab215 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 10;
        try {
            int x = 10/a;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("div by zero error");
        } finally {
            System.out.println("I will be executed anyway");
        }

    }
}
