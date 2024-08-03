package ex_21072024;

public class Lab136 {
    public static void main(String[] args) {
        // types of functions
            // without parameters without return type
            // without parameters with return type
            // with parameter without return type
            // with parameter with return type
        function_type1();

        String function_name = function_type2();
        System.out.println(function_name);

        String name = "with parameter without return type";
        function_type3(name);

        String name2 = "with parameter with return type";
        String function_result = function_type4(name2);
        System.out.println(function_result);




    }
    static void function_type1 ()
    {
        System.out.println("without parameters without return type");
    }
    static String function_type2 (){
        return "without parameters with return type";
    }
    static void function_type3 (String name) {
        System.out.println(name);
    }
    static String function_type4 (String name2) {
        System.out.println(name2);
        return "function type is printed";
    }
}
