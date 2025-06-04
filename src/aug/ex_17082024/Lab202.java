package aug.ex_17082024;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Lab202 {
    public static void main(String[] args) {
        Car c1 = new Car("Mahindra");
        c1.drive();
        System.out.println(c1.make);

        //To access the methods in innerbox we have to create an object in the below way
        Car.GearBox cg = c1.new GearBox();
        cg.m2();
    }
}
class Car {
    String make; // instance variable

    public Car (String make){ //Constructor
        this.make = make;
    }
    //method
    void drive () {
        System.out.println("You can driver Car");
    }

    class GearBox {
        void m2() {
            System.out.println("m2");
        }
        class NutBolts {
           // System.out.println("nutbolts");
        }
    }
}
