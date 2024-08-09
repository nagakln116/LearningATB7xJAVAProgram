package jul.ex_20072024;

public class Lab102 {
    public static void main(String[] args) {
        // interview question - the position of default doesn't matter
        int  a = 10;
        switch (-1) {
            default -> System.out.println("default");
            case -1 -> System.out.println("15");
        }
    }
}
