package aug.ex_04082024.accessModifiers.Police;

public class JrCop {
    public static void main (String args []) {
        Cop c2 = new Cop(25);
        c2.canIShoot(); // As the method is protected, it is allowed in the same package
    }
}
