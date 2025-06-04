package aug.ex_17082024;

public class Lab209 {
    public static void main(String[] args) {
        String ip = args[0]; //If the array length is zero, then we get ArrayIndexOutOfBoundException
        int a = Integer.parseInt(ip); //NumberFormatException if the value of ip is not a number
        int b = 1000/a; //ArithmeticException if the value of ip is 0
        System.out.println(ip);
        System.out.println(b);
    }
}
