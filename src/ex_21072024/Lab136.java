package ex_21072024;

public class Lab136 {
    public static void main(String[] args) {
        // types of functions
            // without parameters without return type
            // without parameter with return type
            // with parameter without return type
            // with parameter with return type
        function_type1();
        String function_name = function_type2();
        System.out.println(function_name);


    }
    static void function_type1 ()
    {
        System.out.println("without parameters without return type");
    }
    static String function_type2 (){
        return "without parameter with return type";
    }

}
