package jul.ex_27072024;

public class Lab142 {
    public static void main(String[] args) {

        final int [] a = new int[5];
        // length of array is fixed anyway so final is meaningless here
        a[0] = 70;
        System.out.println(a[0]);
        a[0] = 57; //it will allow to change because the keyword final is applied to size of array not the values
        System.out.println(a[0]);
    }
}
