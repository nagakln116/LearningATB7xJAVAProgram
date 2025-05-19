package aug.ex_04082024.accessModifiers.Criminal;

import aug.ex_04082024.accessModifiers.Police.Cop;

public class Thief {
    public static void main(String [] args)
    {
        Cop c1 = new Cop(100);
       // c1.canIShoot(); // As the method is protected, it cannot be used in other package
    }
}
