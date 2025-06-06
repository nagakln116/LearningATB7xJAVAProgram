package aug.ex_17082024;

public class Lab216 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception pramod) {
            System.out.println("Div by zero");
            pramod.getMessage();
        } finally {
            System.out.println("I will always be executed, anyHow!");
        }
    }
}
