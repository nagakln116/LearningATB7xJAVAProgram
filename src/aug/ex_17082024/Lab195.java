package aug.ex_17082024;
//Wrapper class
public class Lab195 {
    public static void main (String [] args){
        int a = 10;
        //data type int --> Primitive data type
        System.out.println(a);
        //But Java likes everything to be class and objects instead of primitive
        Integer a1 = 10;
        int b = a1.compareTo(11);
        System.out.println(b);
    }
}
