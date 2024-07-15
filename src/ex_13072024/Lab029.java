package ex_13072024;

public class Lab029 {
    public static void main(String[] args) {
        //calculator
        double a = 10;
        double b = 34;
        //int sum = a + b; // invalid
        double sum = a + b;
        System.out.printf("sum is %f",sum);

        double sub = a - b;
        System.out.printf("\n"+"sub is %f",sub);

        double product = a * b;
        System.out.printf("\n"+"product is %f",product);

        double division = a/b;
        System.out.printf("\n"+"division is %f",division);

        double modulo = a%b;
        System.out.printf("\n"+"modulo is %f",modulo);
    }
}