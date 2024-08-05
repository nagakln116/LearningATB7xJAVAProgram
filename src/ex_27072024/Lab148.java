package ex_27072024;

public class Lab148 {
    public static void main(String[] args) {
        //multi-dimensional array
        //2-D array

        int [][] array_2d = new int[3][3];
        array_2d[0][0] = 10;
        array_2d[0][1] = 10;
        array_2d[0][2] = 10;
        array_2d[1][0] = 20;
        array_2d[1][1] = 20;
        array_2d[1][2] = 20;
        array_2d[2][0] = 30;
        array_2d[2][1] = 30;
        array_2d[2][2] = 30;

        // 10 | 10 | 10
        // 20 | 20 | 20
        // 30 | 30 | 30

        System.out.println(array_2d[1][2]);


    }
}
