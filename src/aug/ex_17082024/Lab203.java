package aug.ex_17082024;

public class Lab203 {
    public static void main(String[] args) {
        ABC a = new ABC() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
    }
}
interface ABC {
    void m1();
    void m2();
}