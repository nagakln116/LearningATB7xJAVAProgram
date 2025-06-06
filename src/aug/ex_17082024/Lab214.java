package aug.ex_17082024;

public class Lab214 {
    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String ip = args[0]; //If the array length is zero, then we get ArrayIndexOutOfBoundException
            int a = 10/0; //NumberFormatException if the value of ip is not a number
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("there is some exception");
            System.out.println(e.getMessage());
        }
        System.out.println("End of program");
    }
}
