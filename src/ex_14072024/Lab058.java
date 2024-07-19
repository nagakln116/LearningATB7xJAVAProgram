package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_price = course + GST; //will result in data loss
        float total_price = course + GST;
        System.out.println(total_price);
    }
}
