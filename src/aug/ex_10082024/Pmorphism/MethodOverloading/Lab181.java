package aug.ex_10082024.Pmorphism.MethodOverloading;

public class Lab181 {
    //Polymorphism
    public static void main (String [] args) {
        MathOperations mathOperations = new MathOperations();
        int sumInt = mathOperations.add(3,4);
        System.out.println("The sum of two integers is "+sumInt);
        double sumDouble = mathOperations.add(3.4, 6.6);
        System.out.println("The sum of two double is "+sumDouble);
        String concatString = mathOperations.add("Naga","rajan");
        System.out.println("The concat of two string is " + concatString);
    }
}
