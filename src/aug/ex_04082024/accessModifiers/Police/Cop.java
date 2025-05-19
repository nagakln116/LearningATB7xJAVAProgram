package aug.ex_04082024.accessModifiers.Police;

public class Cop {
    protected int gun;
    protected String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot (){ // if this method is public, even Thief can use it
        System.out.println("Yes! you can!!");

    }

}
