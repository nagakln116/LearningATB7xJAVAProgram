package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        //multiple conditions in same case is supported
        int a = 7;
        switch (a){
            case 7,8,9:
                System.out.println("electronic gadgets");
            case 1,2,3:
                System.out.println("old watches");
            default:
                System.out.println("none of them");

        }
    }
}
