package aug.ex_17082024;

public class Lab209 {
    public static void main(String[] args) {
        String ip = args[0]; //If the array length is zero, then we get ArrayIndexOutOfBoundException
        int a = Integer.parseInt(ip); //NumberFormatException if the value of ip is not a number
        int b = 1000/a; //ArithmeticException if the value of ip is 0
        System.out.println(ip);
        System.out.println(b);

        //JVM will be Initialized
        //Creates and Starts the main thread - main called
        // 1)Collect the Command line arguments
        // 2)Creates the string array with CLI
        // 3) Lab209.main(0)
        // Now control will be transferred to main method from main thread
        // When problem comes in main -> JVM
        // If don't handle the exception JVM - Exception a=new Exception()
    }
}
