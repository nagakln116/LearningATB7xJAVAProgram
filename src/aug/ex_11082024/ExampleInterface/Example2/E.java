package aug.ex_11082024.ExampleInterface.Example2;

public interface E {
    void startEngine();
    void stopEngine();
    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }
    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }
    static void m1() {
        System.out.println("m1");
    }
    void m2();
    void m3();
}
