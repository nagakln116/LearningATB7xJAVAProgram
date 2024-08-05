package ex_27072024;

public class Lab149_Left_triangle {
    public static void main(String[] args) {
        int [][] left_tri = new int[5][5];
        for (int i = 0; i < left_tri.length; i++) {
            for (int j = 0; j < left_tri.length - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
