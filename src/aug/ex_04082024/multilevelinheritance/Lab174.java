package aug.ex_04082024.multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {
        //Multi Level inheritance
        Child c1 = new Child();
        c1.home(); // c1 can use methods & variables from Father and GrandFather class
        c1.extra();
    }
}
