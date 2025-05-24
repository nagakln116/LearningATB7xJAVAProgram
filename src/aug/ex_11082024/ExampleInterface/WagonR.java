package aug.ex_11082024.ExampleInterface;

public class WagonR implements Engine{
    void drive () {
        startEngine();
        stopEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("WagonR Engine starts");
    }

    @Override
    public void stopEngine() {
        System.out.println("WagonR Engine stops");
    }
}
