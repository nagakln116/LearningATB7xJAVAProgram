package aug.ex_17082024;

public class Lab213 {
    public static void main(String[] args) {
        String ip = null; //If the array length is zero, then we get ArrayIndexOutOfBoundException
        int b = 0; //ArithmeticException if the value of ip is 0
        try {
            ip = args[0];
            int a = Integer.parseInt(ip); //NumberFormatException if the value of ip is not a number
            b = 1000/a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ip);
        System.out.println(b);
    }
}
