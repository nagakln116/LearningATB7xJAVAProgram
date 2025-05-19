package aug.ex_04082024.hasA;

public class Car {
    void startTheCar(){
        new Engine().start(); // A new object is created here, because we are not extending the class
        new Tyre().rolling();
    }
}
