package aug.ex_17082024;

public class Lab212 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip = null; //If the array length is zero, then we get ArrayIndexOutOfBoundException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a = 0; //NumberFormatException if the value of ip is not a number
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b = 0; //ArithmeticException if the value of ip is 0
        try {
            b = 1000/a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(ip);
        System.out.println(b);
    }
}
