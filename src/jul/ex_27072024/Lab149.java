package jul.ex_27072024;

public class Lab149 {
    public static void main(String[] args) {
        int [] [] array_2d = {{10,20,30}, { 40,50,60}, {70,80,90}};
        System.out.println(array_2d.length);
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
