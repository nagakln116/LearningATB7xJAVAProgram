package jul.ex_13072024;

public class Lab016 {
    public static void main(String[] args) {
        byte b = 10;
        // Byte is the datatype decides how many bits of space allocation required
        // 'b' is the reference to the memory space allocated
        // 10 is the value to be stored in binary in the bits allocated
        System.out.println(b);
        //int a = 250000000000; --integer number too large error will be thrown
        long a = 250000000000l;
        System.out.println(a);
    }
}
