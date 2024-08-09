package jul.ex_14072024;

public class Lab068 {
    public static void main(String[] args) {
        String s1 = "Sorna";
        String s2 = new String("Latha");
        //How JVM stores the strings in SCP and in HEAP?
        // in SCP, the values are immutable. which means, if we assign a new value for s1 then it will be created in a new memory and s1 will point to the new value. The old value will remain constant in the pool until it is refreshed.
        // Heap stores values as constant


    }
}
