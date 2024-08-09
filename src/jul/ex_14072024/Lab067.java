package jul.ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        //two ways to create a string
        //way1 --> The variable is created in SCP string constant pool
        String name1 = "Naga";
        //way2 --> The variable is created in Heap
        String name2 = new String("Haran");
        System.out.println(name1 + " " + name2);
        System.out.println(name1.toLowerCase());
        System.out.println(name2.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name2.charAt(0));

    }
}
