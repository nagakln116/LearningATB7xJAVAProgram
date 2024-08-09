package jul.ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //interview questions --> we cannot use same label for two cases??
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("case 1");
                break;
            //case 98: // duplicate labels are not allowed
              //  System.out.println("case 2");
                //break;
        }
    }
}
