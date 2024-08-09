package jul.ex_13072024;

public class Lab020 {
    public static void main(String[] args) {
        byte b = 127;
        //b = b + 1; //java: incompatible types: possible lossy conversion from int to byte
        System.out.println(b);
        short c;
        //c = b + 1; //java: incompatible types: possible lossy conversion from int to short
        //System.out.println(c);
        int d;
        d = b + 1;
        System.out.println(d);

        short s = 100;
        //s = s + 1; //java: incompatible types: possible lossy conversion from int to short
        System.out.println(s);

        int i = 200;
        i = i + 1;
        System.out.println(i);
    }
}
