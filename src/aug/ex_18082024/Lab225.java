package aug.ex_18082024;

public class Lab225 {
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.trim(); //null pointer exception
            if (s1 == null){
                throw new Exception("Add a proper String or not null String");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
