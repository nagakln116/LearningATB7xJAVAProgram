package jul.ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thread Safety in String buffer which delays the process

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
