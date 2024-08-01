package ex_21072024;

public class Lab132 {
    public static void main(String[] args) {
        int a = 10;
        while(a<10){
            System.out.println(a + " from while");
            a++;
        }
        do{
            System.out.println(a + " from do while");
            a++;
        }while (a<10);
    }
}
