package aug.ex_17082024;

public class Lab197 {
    public static void main(String[] args) {
        String num = "10";
        //int a = num; //This is not possible
        Integer a = Integer.valueOf(num);
        System.out.println(a.doubleValue());

        //String to primitive
        int a2 = Integer.parseInt(num);
        System.out.println(a2);


    }
}
