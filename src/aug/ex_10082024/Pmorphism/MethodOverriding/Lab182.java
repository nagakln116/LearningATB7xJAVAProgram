package aug.ex_10082024.Pmorphism.MethodOverriding;

public class Lab182 {
    public static void main (String [] args){
        Dog d1 = new Dog();
        d1.bark();

        Hound h1 = new Hound();
        h1.bark();

        Dog d2 = new Hound();
        d2.bark(); //This will print Hound's method because the local method of the object takes prioritys
    }
}
