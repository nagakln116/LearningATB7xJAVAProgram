package ex_14072024;

public class Lab054{
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a + b; // java: incompatible types: possible lossy conversion from int to byte
        // byte + byte = int
        int c = a + b;
        System.out.println(c);

        char A1 = 'A';
        char A2 = 'B';
        //char C1 = A1 + A2;
        int C1 = A1 + A2;
        System.out.print(C1);
    }
}
