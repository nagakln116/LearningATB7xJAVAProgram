package aug.ex_11082024.ExampleInterface.MultipleInterface;

public class Son implements Father,Mother{
    @Override
    public void money() {
        System.out.println("There is no confusion that whether this is coming from Father or Mother; this money is implemented only in Son");
    }

    @Override
    public void home() {
        System.out.println("This is also implemented in Son");
    }
}
