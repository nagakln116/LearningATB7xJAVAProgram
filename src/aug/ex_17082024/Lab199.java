package aug.ex_17082024;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        a.age = 12;
        System.out.println(A.discount);
        A.m1(); // Static do not need object reference to call method and attributes
        a.m2();
    }
}
class A extends Throwable {
    int age = 36; //Instance variable
    static int discount = 199; // Static variable of class A
    static {
        System.out.println("SIB-A");
    }
    {
        System.out.println("IIB");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
