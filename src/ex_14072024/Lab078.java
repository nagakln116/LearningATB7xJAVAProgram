package ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String s1 = "Hariharan";
        String s2 = s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.substring(4,9));
        System.out.println(s1.indexOf('n'));
        System.out.println(s1.length());

    }
}
