package jul.ex_27072024;

public class Lab149_Right_triangle {
    public static void main(String[] args) {
        int[][] right_tri = new int[5][5];
        for (int i = 0; i < right_tri.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
