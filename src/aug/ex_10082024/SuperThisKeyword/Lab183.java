package aug.ex_10082024.SuperThisKeyword;

public class Lab183 {
    public static void main (String [] args){
        Car car1 = new Car(100);
        car1.display();
    }
}

class Car extends Vehicle{
    private int maxSpeed = 280;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }


    void display (){
        System.out.println("Car speed is "+this.maxSpeed);
        System.out.println("Vehicle speed is "+super.maxSpeed);
        super.message();
        this.message();
    }
    @Override
    void message (){
        System.out.println("Hello vehicle in car");
    }
}

class Vehicle {
    public int maxSpeed = 180;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void message (){
        System.out.println("Hello vehicle in vehicle");
    }
    void message (int a){               //method overloading
        System.out.println("Hello vehicle in vehicle with a");
    }
        }
